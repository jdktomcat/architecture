package org.jdktomcat.spring.boot.caffeine.config;

import com.github.benmanes.caffeine.cache.AsyncLoadingCache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.jdktomcat.spring.boot.caffeine.entry.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 缓存配置类
 */
@Configuration
public class CaffeineCacheConfig {

    private static final Random random = new Random();

    @Bean("userInfoLocalCache")
    public AsyncLoadingCache<String, UserInfo> userInfoLocalCache() {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("market-cache-%d").build();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 20, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(5120), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        return Caffeine.newBuilder().
                initialCapacity(100).
                expireAfterAccess(600, TimeUnit.SECONDS).
                maximumSize(10000).
                recordStats().
                refreshAfterWrite(500, TimeUnit.MILLISECONDS).
                executor(executor).
                buildAsync(this::loadUserInfo);
    }

    private UserInfo loadUserInfo(String username) {
        UserInfo userInfo = new UserInfo();
        userInfo.setName(username);
        userInfo.setAge(random.nextInt(100));
        return userInfo;
    }
}