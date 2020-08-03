package com.liu.springboot04web.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

import com.liu.springboot04web.entities.Department;

@Repository
public class DepartmentDao {
	
	@Autowired
	private static Map<Integer, Department> departments = null;
	
	static {
		departments = new HashMap<Integer, Department>();
		
		departments.put(101, new Department(101,"部门-AA"));
		departments.put(102, new Department(102,"部门-BB"));
		departments.put(103, new Department(103,"部门-CC"));
		departments.put(104, new Department(104,"部门-DD"));
		departments.put(105, new Department(105,"部门-EE"));
	}
	
	public Collection<Department> getDepartments() {
		return departments.values();
	}
	public Department getDepartment(Integer id) {
		return departments.get(id);
	}
}
