package com.liu.springboot04web.bean;

import java.util.Date;

public class Employee {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private Integer gender;// 1 male, 0 famale
	private Department department;
	private Integer depId;
	private Date birthDay;

	public Employee(){}
	
	public Employee(Integer id, String lastName, String email, Integer gender, Department department, Integer depId,Date birthDay) {

//		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.department = department;
		this.depId = depId;
		this.birthDay = birthDay;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Integer getDepId() {return depId; }
	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", gender=" + gender +
				", department=" + department +
				", birthDay=" + birthDay +
				'}';
	}
}
