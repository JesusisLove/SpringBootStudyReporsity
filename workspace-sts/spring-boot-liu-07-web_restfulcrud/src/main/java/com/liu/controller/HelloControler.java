package com.liu.controller;

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
	public String success() {
		
		// classpath:/templates/success.html
		return "success";
	}

}
