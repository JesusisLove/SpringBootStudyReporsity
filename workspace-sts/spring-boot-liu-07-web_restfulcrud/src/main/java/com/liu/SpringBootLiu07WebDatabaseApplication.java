package com.liu;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

@SpringBootApplication
public class SpringBootLiu07WebDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLiu07WebDatabaseApplication.class, args);
		
	}
	
	
	/*
	 * 如何定制：我们可以自己给容器中添加一个视图解析器，`ContentNegotiatingViewResolver`就会自动读取到我们添加到解析器并组合进来
	 * */
	@Bean
	public ViewResolver myViewResolver() {

		return new MyViewResolver();
	}
	private static class MyViewResolver implements ViewResolver{

		@Override
		public View resolveViewName(String viewName, Locale locale) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	}

}
