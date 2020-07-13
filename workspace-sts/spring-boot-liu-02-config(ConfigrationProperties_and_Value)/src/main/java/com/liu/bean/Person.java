package com.liu.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/* @Value和@ConfigurationProperties获取值的比较
 *                   @ConfigrationPropertiew      @Value
 * 功能               批量注入配置文件中的属性         JavaBean中一个属性一个属性地指定
 * 松散绑定（松散语法）  支持                          不支持
 * SpEL              不支持                         支持
 * JSR303数据校验     支持(例如：@Validated)          不支持
 * 复杂类型封装        支持（可以给map等赋值）          不支持（给map赋值会报错！）
 * 
 * */

/*
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties 告诉SpringBoot 将本类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix="this-person"，表示与配置文件中的一个叫“this-person”下的信息进行一一映射
 * 
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能，因此还要加注【@Component】
 * */
@ConfigurationProperties(prefix="this-person")
@Validated

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
