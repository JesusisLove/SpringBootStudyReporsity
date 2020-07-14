package com.example.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLiu04SpringConfigLocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLiu04SpringConfigLocationApplication.class, args);
	}

}

/* ⭐⭐⭐⭐⭐⭐️尚硅谷 SpringBoot配置文件加载位置 
 * ⭐ ️SpringBoot启动会扫描以下位置的application.properties或者文件作为SpringBoot的默认配置文件
 * 		🔸SpringBoot扫描的优先顺序的优先级是从上到下的顺序，所有位置的文件都会被加载，高优先级配置内容会覆盖低优先级配置内容
 * 			①　-- file:./config/
 * 			②　-- file:./
 * 			③　-- classpath:./config/
 * 			④　-- classpath:./
 * 
 * ⭐️　我们也可以通过【spring.config.location】来改变默认配置
 * */

/* https://www.youtube.com/watch?v=iufbdW2wsmM&list=PLmOn9nNkQxJEFsK2HVO9-WA55Z7LZ2N0S&index=17 */