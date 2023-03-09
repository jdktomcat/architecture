package com.jdktomcat.spring.boot.dubbo.api;

/**
 * 测试服务
 */
public interface DubboService {

    /**
     * 方法
     *
     * @param name 名称
     * @return 结果
     */
    default String sayHello(String name) {
        return null;
    }
}

