package com.liu.springboot04web.dao;

import java.util.Map;

import com.liu.springboot04web.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

import com.liu.springboot04web.bean.Department;

@Repository
public class DepartmentDao {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	public Collection<Department> getDepartments() {
		return departmentMapper.getDeptAll();
	}
	public Department getDepartment(Integer id) {

		return departmentMapper.getDeptById(id);
	}
}
