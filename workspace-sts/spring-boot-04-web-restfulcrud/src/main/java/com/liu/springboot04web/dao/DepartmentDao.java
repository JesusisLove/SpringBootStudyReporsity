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
		
		departments.put(101, new Department(101,"D-AA"));
		departments.put(102, new Department(101,"D-BB"));
		departments.put(103, new Department(101,"D-CC"));
		departments.put(104, new Department(101,"D-DD"));
		departments.put(105, new Department(101,"D-EE"));
	}
	
	public Collection<Department> getDepartments() {
		return departments.values();
	}
	public Department getDepartment(Integer id) {
		return departments.get(id);
	}
}
