package com.tangjianghua.shardingsphere.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangjianghua.shardingsphere.entity.Test;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tangjianghua
 * @since 2020-07-29
 */
public interface ITestService extends IService<Test> {
    void insertWithTransation(Test test);
}
