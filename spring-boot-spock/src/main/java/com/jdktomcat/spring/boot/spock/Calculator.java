package com.jdktomcat.spring.boot.spock;

import com.jdktomcat.spring.boot.spock.service.CacheService;

import java.util.Objects;

/**
 * 测试计算类
 */
public class Calculator {
    public int size(String str) {
        return str.length();
    }

    public int sum(int a, int b) {
        return a + b;
    }

    private CacheService cacheService;

    public Calculator(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    public boolean isLoggedInUser(String userName) {
        return Objects.equals(userName, cacheService.getUserName());
    }
}
