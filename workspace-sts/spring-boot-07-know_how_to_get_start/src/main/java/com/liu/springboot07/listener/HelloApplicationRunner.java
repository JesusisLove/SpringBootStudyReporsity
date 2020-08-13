package com.liu.springboot07.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component // 根据SpringBoot启动流程知道，ApplicationRunner是需要放在IOC容器中的，所以要加上@Component注解
public class HelloApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("----注入进IOC容器里了--自定制--HelloApplicationRunner....runing...");
    }
}
