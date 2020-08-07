package com.tangjianghua.shardingsphere.service.impl;

import com.tangjianghua.shardingsphere.entity.Test;
import com.tangjianghua.shardingsphere.mapper.TestMapper;
import com.tangjianghua.shardingsphere.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tangjianghua
 * @since 2020-07-29
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {


    @Autowired
    JdbcTemplate jdbcTemplate;
/*
    @Autowired
    TestMapper testMapper;
*/

    @Override
    @Transactional
    @ShardingTransactionType(TransactionType.XA)
    public void insertWithTransation(Test test) {
        //testMapper.insert(test);
        jdbcTemplate.execute("INSERT INTO test (id,name) VALUES (?,?)",
                (PreparedStatementCallback<Object>) preparedStatement -> {
            preparedStatement.setObject(1, test.getId());
            preparedStatement.setObject(2, test.getName());
            return preparedStatement.executeUpdate();
        });
    }
}
