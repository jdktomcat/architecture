package org.jdktomcat.spring.boot.caffeine.controller;

import org.jdktomcat.spring.boot.caffeine.entry.UserInfo;
import org.jdktomcat.spring.boot.caffeine.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息 Controller
 */
@RestController
@RequestMapping
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/user/{username}")
    public Object getUserInfo(@PathVariable String username) {
        UserInfo userInfo = userInfoService.getByName(username);
        if (userInfo == null) {
            return "没有该用户";
        }
        return userInfo;
    }
}