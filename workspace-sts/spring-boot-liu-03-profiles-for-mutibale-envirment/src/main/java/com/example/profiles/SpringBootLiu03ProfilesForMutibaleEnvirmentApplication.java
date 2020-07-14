package com.example.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLiu03ProfilesForMutibaleEnvirmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLiu03ProfilesForMutibaleEnvirmentApplication.class, args);
	}
	
	/* ⭐⭐⭐⭐⭐⭐️尚硅谷 SpringBoot配置 Profile多环境支持（如开发环境，测试环境，商用环境等，通过Profile快速地来回切换
	 * 
	 * Profile是Spring对不同环境提供不同配置功能对支持，可以通过激活（Active），指定参数（IDE里参数设置），命令行执行命令语句等方式快速切换环境
	 * 
	 * ①　多profile文件形式的写法格式：application-{profile}.properties/yml
	 *                       例如：application-dev.properties:表示这是开发环境的properties配置文件
	 *                       例如：application-test.properties:表示这是测试环境的properties配置文件 
	 *                       例如：application-business.properties:表示这是商用环境的properties配置文件
	 * 
	 * ②　在一个yaml文件里，用【---】分割成不同环境的配置模块　
	 * 
	 * 
	 * ③　激活方式：
	 * 			--命令行激活 ： --spring.profiles.active = dev / test / business
	 * 			--配置文件激活 ： spring.profiles.active = dev / test / business
	 * 			--jvm参数激活 ： -Dspring.profiles.active = dev / test / business
	 * */

}
