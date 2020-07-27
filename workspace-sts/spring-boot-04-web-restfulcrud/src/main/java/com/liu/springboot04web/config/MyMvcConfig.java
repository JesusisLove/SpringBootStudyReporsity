package com.liu.springboot04web.config;

import com.liu.springboot04web.component.MyLocalResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的共功能
/*
// @EnableWebMvc//👈添加该注解，全面接管SpringMVC，自动配置就会失效
 * 在RestFulCRUD项目练习里，将@EnableWebMvc注释掉，使用SpringBoot的自动配置功能
 * */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        // (@EnableWebMvc 不能标注) 启动SpringBoot，打开浏览器，在地址栏输入“http://localhost:8080/liu”即可进入“成功”页面
        registry.addViewController("/liu").setViewName("success");
    }

        /* 例子 3 在浏览器地址栏里输入 【localhost:8080】 改变默认的欢迎页面 */
        /* 20200723 场景说明开始 修改默认访问页面 第二种方式
         * 原来之前在public目录下已经有了index.html这么一个欢迎页面
         * 现在我要求，在templates目录下，也加一个首页叫index.html这么一个页面，并且，默认的页面就是templates/
         * 如何设置呢？
         * ⭐⭐⭐ 所有的WebMvcConfigurerAdapter组件都会一起起作用️
         * */
        @SuppressWarnings("deprecation")
        @Bean //⭐⭐⭐必须将组件注册在容器中，这样SpringBoot才能找到你配置的“/”或“/”
        public WebMvcConfigurerAdapter myWebMvcConfigurerAdapter() {
            WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
                // 快捷键 command + o 挑出addViewControllers，并对该做该方法对具体实现
                @Override
                public void addViewControllers(ViewControllerRegistry registry) {
//				在地址栏里输入【localhost:8080】回车，进入index页面
//				registry.addViewController("/").setViewName("index");
//				registry.addViewController("/index.html").setViewName("index");
//				在地址栏里输入【localhost:8080】回车，进入index页面
                    registry.addViewController("/").setViewName("login");
                    registry.addViewController("/login.html").setViewName("login");
                }
            };
            // 输入【http://localhost:8080/】回车，会进入classpath的templates目录下的index.html页面
            /* ⭐️️️️️️如果application.properties文件里有【server.servlet.context-path=/bazel】则输入
               【http://localhost:8080/bazel】回车，会进入classpath的templates目录下的index.html页面 */
            return adapter;
        }
        /* 20200723 场景说明结束 修改默认访问页面 第二种方式，第一中设置方式参看
         * HelloControler.java👉public String index() */


    /* 2020/07/27
    为了使区域解析器有效，就要在config的MyMvcConfig里面为此解析器添加一个组件 */
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocalResolver();
    }
}
