package com.liu.springboot04web.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControler {
    /* 例子 1 在浏览器地址栏里输入 【localhost:8080/hello】  */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return"hellow world!!!!!^_^";
    }

    /* 例子 2 在浏览器地址栏里输入 【localhost:8080/success1】  */
    @ResponseBody
    @RequestMapping("/success1")
    public String success() {
        // classpath:/templates/success1.html
        return "success1";
    }

    @ResponseBody
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hi", "<h1>你好👋</h1>");
        map.put("users", Arrays.asList("zhang san", "li si", "wang wu"));
        // classpath:/templates/success.html
        return "success";
    }

    /* 例子 3 在浏览器地址栏里输入 【localhost:8080】 改变默认的欢迎页面 */
    /* 20200723 场景说明开始 修改默认访问页面 第一种方式
     * 原来之前在public目录下已经有了index.html这么一个欢迎页面
     * 现在我要求，在templates目录下，也加一个首页叫index.html这么一个页面，并且，默认的页面就是templates/
     * 如何设置呢？
     * 下面的代码就是设置templates目录下的index页面
     * */
//	@RequestMapping({"/","/index.html"})
//	public String index() {
    // 输入【http://localhost:8080/】回车，会进入classpath的templates目录下的index.html页面
//		return "index";
//	}
    /* 20200723 场景说明结束：另外，还有一种方式，参看在
     * MyMvcConfig.java
     * 👉public WebMvcConfigurerAdapter myWebMvcConfigurerAdapter()里做的配置*/
}
