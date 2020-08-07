package com.tangjianghua.shardingsphere.mapper;

import com.tangjianghua.shardingsphere.entity.Merchant;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tangjianghua
 * @since 2020-07-29
 */
public interface MerchantMapper extends BaseMapper<Merchant> {

    List<Map> selectAll();

}
