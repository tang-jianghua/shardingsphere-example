package com.tangjianghua.shardingsphere;

import com.tangjianghua.shardingsphere.entity.Merchant;
import com.tangjianghua.shardingsphere.entity.Test;
import com.tangjianghua.shardingsphere.mapper.MerchantMapper;
import com.tangjianghua.shardingsphere.service.IMerchantService;
import com.tangjianghua.shardingsphere.service.ITestService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.tangjianghua.shardingsphere.mapper")
public class ShardingsphereApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ShardingsphereApplication.class, args);
        IMerchantService bean = context.getBean(IMerchantService.class);
        Merchant merchant = new Merchant();
        merchant.setId("2");
        merchant.setOrgId("asdf");
        merchant.setPlatCode("123");
        bean.insertWithTransation(merchant);
 /*       List<Merchant> merchants = bean.selectList(null);
        merchants.stream().forEach(System.out::println);*/
    /*    TestMapper testMapper = context.getBean(TestMapper.class);
        Test test = new Test();
        //test.setId(2);
        test.setName("test");
        testMapper.insert(test);*/

 /*       Test test = new Test();
        test.setId(5);
        test.setName("test");
        ITestService bean = context.getBean(ITestService.class);
        bean.insertWithTransation(test);*/
    }

}
