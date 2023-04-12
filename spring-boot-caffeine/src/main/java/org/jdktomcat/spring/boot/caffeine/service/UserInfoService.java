package org.jdktomcat.spring.boot.caffeine.service;

import org.jdktomcat.spring.boot.caffeine.entry.UserInfo;

/**
 * 用户信息 Service 接口
 */
public interface UserInfoService {
    /**
     * 获取用户信息
     *
     * @param name 用户ID
     * @return 用户信息
     */
    UserInfo getByName(String  name);
}
