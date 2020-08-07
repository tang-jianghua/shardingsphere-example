package com.tangjianghua.shardingsphere.service;

import com.tangjianghua.shardingsphere.entity.Merchant;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tangjianghua
 * @since 2020-07-29
 */
public interface IMerchantService extends IService<Merchant> {

     void insertWithTransation(Merchant merchant);
     void insertWithTransation2(Merchant merchant);
}
