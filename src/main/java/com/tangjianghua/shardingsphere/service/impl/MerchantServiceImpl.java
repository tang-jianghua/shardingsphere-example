package com.tangjianghua.shardingsphere.service.impl;

import com.tangjianghua.shardingsphere.entity.Merchant;
import com.tangjianghua.shardingsphere.mapper.MerchantMapper;
import com.tangjianghua.shardingsphere.service.IMerchantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
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
public class MerchantServiceImpl extends ServiceImpl<MerchantMapper, Merchant> implements IMerchantService {

    @Autowired
    MerchantMapper merchantMapper;

    @Override
    //@Transactional
    //@ShardingTransactionType(TransactionType.XA)
    public void insertWithTransation(Merchant merchant) {
        merchantMapper.insert(merchant);
        merchant.setId("3");
        insertWithTransation2(merchant);
    }
    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    //@ShardingTransactionType(TransactionType.XA)
    public void insertWithTransation2(Merchant merchant) {
        merchantMapper.insert(merchant);
    }
}
