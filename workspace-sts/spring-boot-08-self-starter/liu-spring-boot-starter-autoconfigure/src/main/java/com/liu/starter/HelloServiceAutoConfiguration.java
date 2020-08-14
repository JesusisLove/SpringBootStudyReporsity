package com.liu.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration// 告诉SpringBoot这是一个配置类
@ConditionalOnWebApplication //判断只有是web应用时才生效
@EnableConfigurationProperties(HelloProperties.class) // 使HelloProperties配置文件生效
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;

    @Bean // 把service添加到SpringBoot的容器中
    public  HelloService helloService() {
        HelloService service = new HelloService();
        service.setHelloProperties(helloProperties);

        // 给你返回一个配置好了的自定制的服务，程序开发者可以在他们自己的工程里引入starter依赖，就可以使用了
        return service;
    }
}
