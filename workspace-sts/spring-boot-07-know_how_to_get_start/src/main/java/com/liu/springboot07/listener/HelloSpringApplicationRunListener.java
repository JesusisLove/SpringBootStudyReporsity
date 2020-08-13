package com.liu.springboot07.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {

    public HelloSpringApplicationRunListener(SpringApplication application, String[] args) {

        /* 如果没有构造方法，系统无法初始化实例而抛出下面异常 （你怎么知道构造器带这样的参数？ 想参照SpringApplicationRunListener，发现是个接口，
        MacOS：按住control+o，参照EventPublishingRunListener的构造器参数就OK了 ）

        * Exception in thread "main" java.lang.IllegalArgumentException:
        * Cannot instantiate interface org.springframework.boot.SpringApplicationRunListener :
        * com.liu.springboot07.listener.HelloSpringApplicationRunListener
        *
        * Caused by: java.lang.NoSuchMethodException:
        * com.liu.springboot07.listener.HelloSpringApplicationRunListener.<init>(org.springframework.boot.SpringApplication, [Ljava.lang.String;)
        * */
    }

    @Override
    public void starting() {

        System.out.println("🔹🔹🔹🔹配置自定义的 监听器🔹🔹🔹HelloSpringApplicationRunListener🔹🔹🔹🔹starting...");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        Object o = environment.getSystemProperties().get("os.name");
        System.out.println("🔹🔹🔹🔹配置自定义的 监听器🔹🔹🔹HelloSpringApplicationRunListener🔹🔹🔹🔹environmentPrepared..." + o);

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

        System.out.println("🔹🔹🔹🔹配置自定义的 监听器🔹🔹HelloSpringApplicationRunListener🔹🔹🔹🔹contextPrepared...");

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("🔹🔹🔹🔹配置自定义的 监听器🔹🔹🔹HelloSpringApplicationRunListener🔹🔹🔹🔹contextLoaded...");

    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("🔹🔹🔹🔹配置自定义的 监听器🔹🔹🔹HelloSpringApplicationRunListener🔹🔹🔹🔹started...");

    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("🔹🔹🔹🔹配置自定义的 监听器🔹🔹🔹HelloSpringApplicationRunListener🔹🔹🔹🔹running...");

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("🔹🔹🔹🔹配置自定义的 监听器🔹🔹🔹HelloSpringApplicationRunListener🔹🔹🔹🔹failed...");

    }
}
