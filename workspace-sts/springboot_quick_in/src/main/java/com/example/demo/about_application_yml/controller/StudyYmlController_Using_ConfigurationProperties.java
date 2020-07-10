
/* ⭐⭐⭐⭐　Browser 中で「White page」が出る原因
 * ️package com.example.about_application_yml.controller;
 * 
 * White pageが出る原因としては、@SpringBootApplicationと同じパッケージか、ないしはサブパッケージに@Controllerがないと、初期設定では動作しません。
 * だから、StudyYmlController_Using_ConfigurationPropertiesは下記のように命名します
 * 『package com.example.demo.about_application_yml.controller』
 * */

package com.example.demo.about_application_yml.controller; // SpringBootApplicationがcom.example.demo下になるから、

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "person")
public class StudyYmlController_Using_ConfigurationProperties {
	/*
	 * // 单一的从application.yml文件获取映射数据
	 * @Value("${person.name}") private String name;
	 * @Value("${person.addr}") private String addr;
	 */

	private String name;
	private String addr;

	@RequestMapping("/cp")
	@ResponseBody
	public String mappingInfo() {
		return "name:" + name + ",  addr:" + addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
