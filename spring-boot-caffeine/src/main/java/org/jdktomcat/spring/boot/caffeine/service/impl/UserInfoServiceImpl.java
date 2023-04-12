package org.jdktomcat.spring.boot.caffeine.service.impl;

import com.github.benmanes.caffeine.cache.AsyncLoadingCache;
import com.github.benmanes.caffeine.cache.Cache;
import lombok.extern.slf4j.Slf4j;
import org.jdktomcat.spring.boot.caffeine.entry.UserInfo;
import org.jdktomcat.spring.boot.caffeine.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    AsyncLoadingCache<String, UserInfo> userInfoLocalCache;

    @Override
    public UserInfo getByName(String username) {
        // 先从缓存读取
        CompletableFuture<UserInfo> future = userInfoLocalCache.get(username);
        UserInfo userInfo = null;
        try{
            userInfo = future.get();
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return userInfo;
    }
}
