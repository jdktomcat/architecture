package com.jdktomcat.spring.boot.mybatis.mapper;

import com.jdktomcat.spring.boot.mybatis.mapper.entry.UserInfoDO;

public interface UserInfoMapper {

    int insert(UserInfoDO userInfoDO);

    UserInfoDO getById(long id);

    int update(UserInfoDO userInfoDO);

    int delete(long id);
}
