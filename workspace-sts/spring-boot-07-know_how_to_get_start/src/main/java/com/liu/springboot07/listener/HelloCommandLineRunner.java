package com.liu.springboot07.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // 根据SpringBoot启动流程知道，CommandLineRunner是需要放在IOC容器中的，所以要加上@Component注解
public class HelloCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("====注入进IOC容器里了==自定制==HelloCommandLineRunner....runing...");
    }
}
