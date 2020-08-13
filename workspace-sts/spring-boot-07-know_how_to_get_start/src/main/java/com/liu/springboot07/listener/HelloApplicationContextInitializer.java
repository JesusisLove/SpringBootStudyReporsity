package com.liu.springboot07.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/*
* 根据SpringBoot启动流程知道，ApplicationContextInitializer是被配置在文件路径下的"META-INF/spring.factories"里面的
* 根据这个启发，我们就要在当前工程的资源文件路径(resources/)下建立一个META-INF/spring.factories
*
* */
public class HelloApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("🔸🔸🔸🔸配置自定义的 初始化器🔸🔸🔸HelloApplicationContextInitializer🔸🔸🔸🔸initialize..."+ configurableApplicationContext);
    }
}
