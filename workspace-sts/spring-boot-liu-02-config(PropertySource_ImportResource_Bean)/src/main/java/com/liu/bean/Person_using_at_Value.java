package com.liu.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* @Value和@ConfigurationProperties获取值的比较
 *                   @ConfigrationPropertiew      @Value
 * 功能               批量注入配置文件中的属性         JavaBean中一个属性一个属性地指定
 * 松散绑定（松散语法）  支持                          不支持
 * SpEL              不支持                         支持
 * JSR303数据校验      支持(例如：@Validated)         不支持
 * 复杂类型封装        支持（可以给map等赋值）          不支持（给map赋值会报错！）
 * 
 * */




/*
 * 通过@Component注解，把yml中的有“this-person”前缀中的值注入给Person组件
 * */
@Component  //容器中的Person组件，到底有没有把配置文件中的“this-person”前缀中的值注入给Person组件
public class Person_using_at_Value {
	/* 过去Spring框架给Person组件配置属性是这样的
	 *  <bean class="Person">
	 * 			<property name="lastName" value="?"></property>
	 *  </bean">
	 *  ※1: value="?"
	 *  	value可以直接设置字面量如：value=“张大年”
	 *  	value可以设置key值如：value=${key}。从环境变量或者配置文件中获取值
	 *  	value可以设置Spring的表达式如：value=#{SpEL}。 #{}里些Spring支持的表达式
	 * */
	// springboot的@Value就相当于 ※1
	@Value("${this-person.last-name}") 
	private String lastName;
	@Value("#{11*2}")
	private Integer age; //通过计算22=11*2 赋值给age
	@Value("true") 
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
