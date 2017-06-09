package com.cl.user.impl;

import com.cl.user.servicei.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/6/9.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    public String sayHello() {
        System.out.println("hello world123 -----------");
        return "hello world 123--";
    }
}
