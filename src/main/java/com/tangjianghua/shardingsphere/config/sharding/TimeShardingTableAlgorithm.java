package com.tangjianghua.shardingsphere.config.sharding;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/**
 * @author
 * @version 1.0.0
 * @ClassName TimeShardingTableAlgorithm.java
 * @Description TODO
 * @createTime 2019年08月22日 15:46:00
 */

public class TimeShardingTableAlgorithm implements PreciseShardingAlgorithm<Date> {


    /**
     * 格式化为年月
     */
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");

    @Override
    public String doSharding(Collection collection, PreciseShardingValue preciseShardingValue) {
        StringBuffer tableName = new StringBuffer();
        tableName.append(preciseShardingValue.getLogicTableName())
                .append("_").append(sdf.format(preciseShardingValue.getValue()));

        return tableName.toString();
    }
}

