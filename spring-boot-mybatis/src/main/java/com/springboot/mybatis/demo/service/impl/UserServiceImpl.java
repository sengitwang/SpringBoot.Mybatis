package com.springboot.mybatis.demo.service.impl;

import com.springboot.mybatis.demo.mapper.UserMapper;
import com.springboot.mybatis.demo.model.User;
import com.springboot.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sen on 2016/8/17.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> queryUser() {
        return userMapper.queryUser();
    }
}
