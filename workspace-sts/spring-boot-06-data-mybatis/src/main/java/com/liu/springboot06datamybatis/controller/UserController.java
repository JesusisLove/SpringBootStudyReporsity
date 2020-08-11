package com.liu.springboot06datamybatis.controller;

import com.liu.springboot06datamybatis.bean.Department;
import com.liu.springboot06datamybatis.bean.User;
import com.liu.springboot06datamybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //不返回页面，只返回json数据
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return  userMapper.getUserById(id);
    }

    @GetMapping("/alluser")
    public User getUser() {
        return userMapper.getAllUser();
    }

    @GetMapping("/user")
    public User insertUser(User user) {
        userMapper.insertUser(user);
        return user;
    }




}
