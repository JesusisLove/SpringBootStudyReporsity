package com.liu.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/*
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties 告诉SpringBoot 将本类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix="this-person"，表示与配置文件中的一个叫“this-person”下的信息进行一一映射
 * 
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能，因此还要加注【@Component】
 * */
@ConfigurationProperties(prefix="this-person")

//⭐⭐⭐知识点️️️️ 加载指定的自定义的配置文件，告诉SpringBoot，对Person组件，用我自定义的properties文件里的内容加注
@PropertySource(value = { "classpath:person.properties" })
/*
 * 通过@Component注解，把yml中的有“this-person”前缀中的值注入给Person组件
 * */
@Component  //容器中的Person组件，到底有没有把配置文件中的“this-person”前缀中的值注入给Person组件
public class Person {
	
	
	private String lastName;
	private Integer age;
	Boolean boss;
	private Date birth;
	private Map<String,Object> maps;
	private List<Object> lists;
	private Dog dog;

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", age=" + age + ", boss=" + boss + ", birth=" + birth + ", maps="
				+ maps + ", lists=" + lists + ", dog=" + dog + "]";
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getBoss() {
		return boss;
	}
	public void setBoss(Boolean boss) {
		this.boss = boss;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	
}
