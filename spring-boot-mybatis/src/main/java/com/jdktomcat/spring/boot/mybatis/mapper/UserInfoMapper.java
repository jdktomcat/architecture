package com.jdktomcat.spring.boot.mybatis.mapper;

import com.jdktomcat.spring.boot.mybatis.mapper.entry.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {

    int insert(UserInfoDO userInfoDO);

    UserInfoDO getById(Long id);

    int update(UserInfoDO userInfoDO);

    int delete(long id);
}
