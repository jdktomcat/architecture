package com.jdktomcat.spring.boot.dubbo.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jdktomcat.spring.boot.dubbo.api.DubboService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("dubbo")
public class DubboController {

    @Reference
    private DubboService dubboService;

    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return dubboService.sayHello(name);
    }
}
