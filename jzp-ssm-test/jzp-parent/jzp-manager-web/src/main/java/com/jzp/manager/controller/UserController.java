package com.jzp.manager.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

  /*  private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }*/
}
