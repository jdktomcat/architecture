package com.jdktomcat.spring.boot.mybatis.service.impl;

import com.jdktomcat.spring.boot.mybatis.mapper.UserInfoMapper;
import com.jdktomcat.spring.boot.mybatis.mapper.entry.UserInfoDO;
import com.jdktomcat.spring.boot.mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfoDO getById(Long id) {
        return userInfoMapper.getById(id);
    }
}
