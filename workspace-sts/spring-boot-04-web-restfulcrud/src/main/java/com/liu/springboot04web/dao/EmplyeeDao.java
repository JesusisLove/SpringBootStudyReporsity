package com.liu.springboot04web.dao;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import com.liu.springboot04web.entities.*;

@Repository
public class EmplyeeDao {
	private static Map<Integer, Employee> employees;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	
	static {
		employees = new HashMap<Integer,Employee>();
		
		employees.put(1001, new Employee (1001,"E-AA","aa@hotmail.com",1,new Department(101,"D-AA"), new Date()));
		employees.put(1002, new Employee (1002,"E-BB","bb@hotmail.com",1,new Department(102,"D-BB"), new Date()));
		employees.put(1003, new Employee (1003,"E-CC","cc@hotmail.com",0,new Department(103,"D-CC"), new Date()));
		employees.put(1004, new Employee (1004,"E-DD","dd@hotmail.com",0,new Department(104,"D-DD"), new Date()));
		employees.put(1005, new Employee (1005,"E-EE","ee@hotmail.com",1,new Department(105,"D-EE"), new Date()));
	}
	
	private static Integer initId = 1006;
	
	public void save(Employee employee) {
		if(employee.getId() == null) {
			employee.setId(initId++);
		}
		
		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
		employees.put(employee.getGender(), employee);
	}

}
