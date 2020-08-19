package com.liu.springboot04web.dao;

import java.util.Map;

import com.liu.springboot04web.bean.Employee;
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

	// 执行部门信息的保存处理
	public void save(Department department) {
		if(department.getDepId() == null) {
			insert(department);
		} else {
			update(department);
		}
	}
	// 添加新部门
	private void insert(Department department) {
		departmentMapper.insertDept(department);

	}
	// 修改指定部门
	private void update(Department department) {
		departmentMapper.updateDept(department);
	}
	// 删除指定部门
	public void delete(Integer id) { departmentMapper.deleteDeptById(id); }
}
