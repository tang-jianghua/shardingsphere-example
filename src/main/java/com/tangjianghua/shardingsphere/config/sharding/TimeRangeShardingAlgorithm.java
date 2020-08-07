package com.tangjianghua.shardingsphere.config.sharding;

/**
 * @author
 * @version 1.0.0
 * @ClassName TimeRangeShardingAlgorithm.java
 * @Description TODO
 * @createTime 2019年08月22日 15:36:00
 */

import com.google.common.collect.Range;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @author 搜查多表
 * 范围搜索时（跨表）应传递时间戳并左移22位
 */
public class TimeRangeShardingAlgorithm implements RangeShardingAlgorithm<Date> {

    /**
     * 格式化为年月
     */
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<Date> shardingValue) {
        Collection<String> result = new LinkedHashSet<>();
        Range<Date> shardingKey = shardingValue.getValueRange();
        Date startDate = shardingKey.lowerEndpoint();
        Date endDate = shardingKey.upperEndpoint();
        //获取日期直接的月份

        List<String> monthBetween = this.getMonthBetween(startDate, endDate);
        for (String yearMonth : monthBetween) {
            StringBuffer tableName = new StringBuffer();
            tableName.append(shardingValue.getLogicTableName())
                    .append("_").append(yearMonth);
            result.add(tableName.toString());
        }
        return result;
    }


    private List<String> getMonthBetween(Date minDate, Date maxDate) {
        ArrayList<String> result = new ArrayList<>();

        Calendar min = Calendar.getInstance();
        Calendar max = Calendar.getInstance();

        min.setTime(minDate);
        min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);

        max.setTime(maxDate);
        max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

        Calendar curr = min;
        while (curr.before(max)) {
            result.add(sdf.format(curr.getTime()));
            curr.add(Calendar.MONTH, 1);
        }

        return result;
    }
}
