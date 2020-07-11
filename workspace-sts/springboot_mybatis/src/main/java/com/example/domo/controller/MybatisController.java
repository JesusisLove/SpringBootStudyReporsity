package com.example.domo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.TUser;
import com.example.demo.mapper.TUserMapper;

import java.util.List;

@Controller
public class MybatisController {
	
	@Autowired
	private TUserMapper userMapper;
	
	@RequestMapping("/users")
	@ResponseBody
	public List<TUser> queryUserList() {
		List<TUser> users = userMapper.queryUserList();
		return users;
	}

}
