package com.liu.controller;

import java.util.Arrays;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloControler {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return"hellow world!!!!!^_^";
		
	}
	
//	@ResponseBody
	@RequestMapping("success")
	public String success(Map<String,Object> map) {
		map.put("hi", "<h1>你好👋</h1>");
		map.put("users", Arrays.asList( "zhang san","li si","wang wu"));
		// classpath:/templates/success.html
		return "success";
	}

}
