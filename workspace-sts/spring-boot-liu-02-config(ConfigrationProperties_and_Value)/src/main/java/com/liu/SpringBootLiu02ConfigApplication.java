package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * @SpringBootApplication：标注主程序类，说明这是一个spring boot应用的一个主配置类
 * */

@SpringBootApplication
@RestController
public class SpringBootLiu02ConfigApplication {

	public static void main(String[] args) {
		// 启动spring应用
		SpringApplication.run(SpringBootLiu02ConfigApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
}
