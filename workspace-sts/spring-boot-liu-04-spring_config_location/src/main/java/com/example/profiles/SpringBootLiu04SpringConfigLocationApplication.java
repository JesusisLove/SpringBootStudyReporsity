package com.example.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLiu04SpringConfigLocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLiu04SpringConfigLocationApplication.class, args);
	}
}

/* ⭐⭐⭐⭐⭐⭐️尚硅谷 SpringBoot配置文件加载位置 
 * ⭐ ️SpringBoot启动会扫描以下位置的application.properties或者文件作为SpringBoot的默认配置文件
 * 		🔸SpringBoot扫描的优先顺序的优先级是从上到下的顺序，所有位置的文件都会被加载，高优先级配置内容会覆盖低优先级配置内容
 * 			①　-- file:./config/
 * 			②　-- file:./
 * 			③　-- classpath:./config/
 * 			④　-- classpath:./
 * 		🔸SpringBoot会从这四个位置全部加载主配置文件(application.properties application.yml),且配置互补（即，取这四个地方的文件内容的并集）
 * 
 * ⭐️　我们也可以通过【spring.config.location】来改变配置文件的默认配置位置
 *  		🔸spring.config.location的使用timing：（在项目运维的阶段补充配置文件的时候经常用到）
 *  			项目打包好以后，我们可以使用命令行参数的形式，启动项目的时候来指定配置文件的新位置；
 *  			指定新位置的配置文件会和默认加载的这些配置文件一起作用，形成互补配置。
 * */
// 教学参考视频
/* https://www.youtube.com/watch?v=iufbdW2wsmM&list=PLmOn9nNkQxJEFsK2HVO9-WA55Z7LZ2N0S&index=17 */

/* ⭐⭐⭐⭐⭐⭐️尚硅谷 SpringBoot外部配置加载顺序 
 *  参看SrpingBoot官方网站文档：https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#boot-features-external-config
 */
//教学参考视频
// https://www.youtube.com/watch?v=mIJzlAuWk2w&list=PLmOn9nNkQxJEFsK2HVO9-WA55Z7LZ2N0S&index=18