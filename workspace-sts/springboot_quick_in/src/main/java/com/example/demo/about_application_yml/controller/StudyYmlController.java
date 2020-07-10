package com.example.demo.about_application_yml.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudyYmlController {
	// 单一的从application.yml文件获取映射数据
	@Value("${person.name}")
	private String name;

	@Value("${person.addr}")
	private String addr;

	@RequestMapping("/mapyml")
	@ResponseBody
	public String StudyYml() {
		return  "name:" + name + ",  addr:" + addr;
	}
}
