package com.liu.springboot04web.dao;

import java.util.List;
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
		List<Department> list = departmentMapper.getDeptAll();
		System.out.println("select的部门数据：\n" + list.toString());
		return list;
	}

	public Department getDepartment(Integer id) {
		Department department = departmentMapper.getDeptById(id);
		System.out.println("select的部门数据：" + department.toString());
		return department;
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
		System.out.println("insert的部门数据：" + department.toString());
		departmentMapper.insertDept(department);

	}
	// 修改指定部门
	private void update(Department department) {
		System.out.println("update的部门数据：" + department.toString());
		departmentMapper.updateDept(department);
	}
	// 删除指定部门
	public void delete(Integer id) { departmentMapper.deleteDeptById(id); }
}
