package com.liu.springboot06datamybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 2020/08/10 学习@Mapper的注解方式访问数据库
* 关于@MapperScan(value = "com.liu.springboot06datamybatis.mapper")
*
* 这样设置，就相当于mapper包下，给所有的类里都会自动配置上@Mapper注解（如果有1000个类，要加1000个@Mapper，
* 用这一个MapperScan注解就不必每个类里都加Mapper注解了）
* */
@MapperScan(value = "com.liu.springboot06datamybatis.mapper")
@SpringBootApplication
public class SpringBoot06DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06DataMybatisApplication.class, args);
    }

}
