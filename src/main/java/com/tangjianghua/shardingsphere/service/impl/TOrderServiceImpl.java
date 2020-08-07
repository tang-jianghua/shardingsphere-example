package com.tangjianghua.shardingsphere.service.impl;

import com.tangjianghua.shardingsphere.entity.TOrder;
import com.tangjianghua.shardingsphere.mapper.TOrderMapper;
import com.tangjianghua.shardingsphere.service.ITOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tangjianghua
 * @since 2020-07-30
 */
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements ITOrderService {

}
