package com.liu;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.liu.bean.Person;
import com.liu.service.HelloService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootLiu02ConfigApplicationTests {

	@Autowired
	Person person;
	@Autowired
	ApplicationContext ioc;
	@Test
	public void testHelloService() {
		boolean b = ioc.containsBean("helloService");
		// 学习SpringBoot之 @PropertySource,@ImportResource,@Bean（二）
		/* ⭐⭐⭐ ioc.containsBean("helloService")中的 --> “helloService”
		 * beans.xml --> <bean id=⭐"helloService"⭐ class="com.liu.service.HelloService">
		 * MyAppConfig.java --> public HelloService ⭐helloService⭐() 
		 * */
		System.out.println("helloService is in IOC: " + b);
	}
	@Test
	void contextLoads() {
		System.out.print(person);
	}
}
