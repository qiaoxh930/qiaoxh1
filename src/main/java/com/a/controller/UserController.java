package com.a.controller;

import com.a.entity.User;
import com.a.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserController
 * @Author qiaoxh
 * @Date 2020/9/12 17:12
 * @Description TOOO
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userServiceImpl;
    @RequestMapping("login")
    public String login(User user){
        userServiceImpl.queryOne(user);
        return "redirect:/jssues/queryOne";
    }
}
