package com.liu.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/*
@ResponseBody // ResponseBody 写在某个类上表示当前类的所有方法返回来的数据送给浏览器。（如果是对象，则转换为json数据）
@Controller
*/
@RestController  /* spring4.2版本后新加的一个注解器  相当于；（@Controller + @ResponseBody） */
public class HelloController {

	
	@RequestMapping("/hello-world")
//	@ResponseBody //ResponseBody 写在某个方法上表示当前的这个方法返回的数据直接送给浏览器
	public String hello(){ 
		return "hello-world!!!!!!!";	
	}
 }
