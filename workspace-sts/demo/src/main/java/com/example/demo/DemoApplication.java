package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //加该注解，就是告诉SpringBoot：DemoApplication是SpringBoot的引导类。
@RestController
public class DemoApplication { 
	@GetMapping
	String home() {
		return "Hello Bezal! ^_^ 😊";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
