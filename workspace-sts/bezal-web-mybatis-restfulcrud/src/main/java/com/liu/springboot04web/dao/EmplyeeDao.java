package com.liu.springboot04web.dao;
import java.util.*;

import com.liu.springboot04web.mapper.DepartmentMapper;
import com.liu.springboot04web.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.liu.springboot04web.bean.*;

@Repository
public class EmplyeeDao {
//	@Autowired
//	private DepartmentDao departmentDao;

	@Autowired //get,set方法
	EmployeeMapper employeeMapper;
	@Autowired
	DepartmentMapper departmentMapper;

//	private static Integer initId = 1001;
	public void save(Employee employee) {
		if(employee.getId() == null) {
			insert(employee);
		} else {
			update(employee);
		}

//		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
//		employees.put(employee.getId(), employee);
	}
	// 查询所有员工
	public Collection<Employee> getAll() {
		return employeeMapper.getEmpAll();
	}
	// 查询指定员工
	public Employee get(Integer id) {
		// 从bezal_employee表取得该员工信息
		Employee employee = employeeMapper.getEmpById(id);

		// 从bezal_department表取得该员工所在的部门信息
		Integer depid = employee.getDepId();
		Department department = departmentMapper.getDeptById(depid);
		employee.setDepartment(department);
		return employee;
	}
	// 添加新员工
	public Employee insert(Employee employee) {
		employeeMapper.insertEmp(employee);
		return employee;
	}
	// 修改指定员工
	public Employee update(Employee employee) {
		employeeMapper.updateEmp(employee);
//		// 从bezal_department表取得该员工所在的部门信息
//		Integer depid = employee.getDepId();
//		Department department = departmentMapper.getDeptById(depid);
//		employee.setDepartment(department);
		return employee;
	}
	// 删除指定员工
//	public void delete(Integer id) { employees.remove(id); }
	public void delete(Integer id) { employeeMapper.deleteEmp(id); }

}
