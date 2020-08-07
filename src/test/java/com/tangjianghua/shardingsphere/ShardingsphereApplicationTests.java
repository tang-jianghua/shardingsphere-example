package com.tangjianghua.shardingsphere;

import com.tangjianghua.shardingsphere.entity.TOrder;
import com.tangjianghua.shardingsphere.mapper.MerchantMapper;
import com.tangjianghua.shardingsphere.mapper.TOrderItemMapper;
import com.tangjianghua.shardingsphere.mapper.TOrderMapper;
import com.tangjianghua.shardingsphere.mapper.TOrgMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class ShardingsphereApplicationTests {


    @Autowired
    private MerchantMapper merchantMapper;
    @Autowired
    private TOrgMapper tOrgMapper;
    @Autowired
    private TOrderMapper orderMapper;
    @Autowired
    private TOrderItemMapper orderItemMapper;

    @Test
    public void test(){

 /*       TOrg tOrg = new TOrg();
        tOrg.setOrgId("123");
        tOrg.setOrgName("测试机构");
        tOrg.setPlatCode("900007");
        tOrgMapper.insert(tOrg);*/
/*        List<Map> maps = merchantMapper.selectAll();
        maps.stream().forEach(System.out::println);*/

        TOrder tOrder = new TOrder();
        tOrder.setCreated(LocalDateTime.now());
       orderMapper.insert(tOrder);
       orderMapper.insert(tOrder);
       orderMapper.insert(tOrder);
       orderMapper.insert(tOrder);
       orderMapper.insert(tOrder);
       orderMapper.insert(tOrder);
       orderMapper.insert(tOrder);
        System.out.println(tOrder);
    }
}
