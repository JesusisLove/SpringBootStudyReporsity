package com.liu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.liu.service.HelloService;

/* ⭐⭐⭐️
 * 学习SpringBoot之 @PropertySource,@ImportResource,@Bean（二）
 *
 * @Configuration　指明当前类是一个配置类，就是用来替代之前的Spring配置文件 beans.xml
 * 过去是通过在beans.xml配置文件中，利用<bean> </bean>标签添加类组件
 * 
 *  SpringBoot推荐写配置类来取代 beans.xml的配置文件，并提供了@Bean注解
 * 
 * */
@Configuration
public class MyAppConfig {
	@Bean //⭐⭐⭐ 将该方法的返回值添加到容器中，容器中这个组件的默认id就是方法名“helloService”
	public HelloService helloService() { //取代beans.xml --> <bean id="helloService" class="com.liu.service.HelloService">
		System.out.println("配置类@Bean给容器添加组件了。。。");
		return new HelloService();
	}
}
