package com.rise.authorize.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张牧之
 * @date 2022-12-04 19:02:25
 * @Email zhanglichang99@gmail.com
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("testGateway")
    public String testGateway () {
        return "success";
    }
}
