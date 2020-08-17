package com.liu.springboot04web.dao;
import java.util.*;

import com.liu.springboot04web.mapper.DepartmentMapper;
import com.liu.springboot04web.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.liu.springboot04web.bean.*;

@Repository
public class EmplyeeDao {

	@Autowired //get,set方法
	EmployeeMapper employeeMapper;
	@Autowired
	DepartmentMapper departmentMapper;

	// 执行员工信息的保存处理
	public void save(Employee employee) {
		if(employee.getId() == null) {
			insert(employee);
		} else {
			update(employee);
		}
	}
	// 查询所有员工
	public Collection<Employee> getAll() {
		List<Employee> list = employeeMapper.getEmpAll();
		for (Employee e : list) {
			// 从bezal_department表取得该员工所在的部门信息
			Integer depid = e.getDepId();
			Department department = departmentMapper.getDeptById(depid);
			e.setDepartment(department);
		}

		return list;
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
	private Employee insert(Employee employee) {
		employeeMapper.insertEmp(employee);

		return employee;
	}
	// 修改指定员工
	private Employee update(Employee employee) {
		employeeMapper.updateEmp(employee);

//		return employee;//备注：新规员工，修改员工无需返回 employee对象，所以完全可以把方法类型改为 public void insert/update...
		return null;
	}
	// 删除指定员工
	public void delete(Integer id) { employeeMapper.deleteEmp(id); }

}
