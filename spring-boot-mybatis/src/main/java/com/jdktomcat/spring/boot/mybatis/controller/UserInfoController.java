package com.jdktomcat.spring.boot.mybatis.controller;


import com.jdktomcat.spring.boot.mybatis.mapper.entry.UserInfoDO;
import com.jdktomcat.spring.boot.mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping("/get")
    public UserInfoDO sayHello(long id) {
        return userInfoService.getById(id);
    }

}
