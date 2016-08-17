package com.springboot.mybatis.demo.service;

import com.springboot.mybatis.demo.model.User;

import java.util.List;

/**
 * Created by sen on 2016/8/17.
 */
public interface UserService {

    List<User> queryUser();
}
