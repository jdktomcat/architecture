package com.jdktomcat.spring.boot.mybatis.service;

import com.jdktomcat.spring.boot.mybatis.mapper.entry.UserInfoDO;

/**
 * 用户服务接口
 */
public interface UserInfoService {


    UserInfoDO getById(Long id);

}
