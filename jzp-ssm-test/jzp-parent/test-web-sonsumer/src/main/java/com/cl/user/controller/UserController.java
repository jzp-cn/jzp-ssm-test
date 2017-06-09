package com.cl.user.controller;

import com.cl.user.servicei.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/6/9.
 */
@Controller
public class UserController {

    @Resource(name="userService")
    private UserService userService;

    @RequestMapping("/hello/test/world")
    public void sayHello(){
        System.out.println(userService.sayHello()+"==============");
    }
}
