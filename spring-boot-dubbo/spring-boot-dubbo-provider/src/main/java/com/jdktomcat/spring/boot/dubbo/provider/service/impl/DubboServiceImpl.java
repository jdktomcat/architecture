package com.jdktomcat.spring.boot.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jdktomcat.spring.boot.dubbo.api.DubboService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Service
@Component
public class DubboServiceImpl implements DubboService {

    @Override
    public String sayHello(String name) {
        log.info("hello {}", name);
        return "hello " + name;
    }
}
