package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * @SpringBootApplication：标注主程序类，说明这是一个spring boot应用的一个主配置类
 * */
@SpringBootApplication
@RestController
/* 学习SpringBoot之 @PropertySource,@ImportResource,@Bean（二）
 *  SpringBoot不推荐使用xml配置文件来配置容器组件，推荐用户写配置类：参考用户写的配置类 --> MyAppConfig.java
 *  @ImportResource (locations = {"classpath:beans.xml"}) //⭐⭐⭐知识点️️️️导入Spring的配置文件，让自定义的XML文件（如beans.xml）内容生效；
*/
public class SpringBootLiu02ConfigApplication {

	public static void main(String[] args) {
		// 启动spring应用
		SpringApplication.run(SpringBootLiu02ConfigApplication.class, args);
	}
}
