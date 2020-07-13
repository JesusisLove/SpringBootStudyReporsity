package com.liu;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.liu.bean.Person;
import com.liu.bean.Person_using_at_Value;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootLiu02ConfigApplicationTests {
	
	@Autowired
	Person person;
	
	@Autowired // 每一个测试类都必须带一个@Autowired，否则控制台出null
	Person_using_at_Value pv;

	@Test
	void contextLoads() {
		System.out.print(person);
		System.out.print(pv);
	}
}
