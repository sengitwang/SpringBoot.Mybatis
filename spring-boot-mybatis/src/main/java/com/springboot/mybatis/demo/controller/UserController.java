package com.springboot.mybatis.demo.controller;

import com.springboot.mybatis.demo.model.User;
import com.springboot.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by sen on 2016/8/17.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public List<User> queryUser(){
       return userService.queryUser();
    }
}
