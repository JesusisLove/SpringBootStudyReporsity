package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.Department;
import com.liu.springboot04web.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class Old_EmplyeeDao {
	private static Map<Integer, Employee> employees;

	@Autowired
	private DepartmentDao departmentDao;
	static {
		employees = new HashMap<Integer,Employee>();

//		employees.put(1001, new Employee (1001,"张展瑜","aa@hotmail.com",1,new Department(101,"部门-AA"), new Date()));
//		employees.put(1002, new Employee (1002,"张叶","bb@hotmail.com",0,new Department(102,"部门-BB"), new Date()));
//		employees.put(1003, new Employee (1003,"孙扬","cc@hotmail.com",1,new Department(103,"部门-CC"), new Date()));
//		employees.put(1004, new Employee (1004,"毛雨","dd@hotmail.com",0,new Department(104,"部门-DD"), new Date()));
//		employees.put(1005, new Employee (1005,"刘义民","ee@hotmail.com",1,new Department(105,"部门-EE"), new Date()));
	}

	private static Integer initId = 1006;

	public void save(Employee employee) {
		if(employee.getId() == null) {
			employee.setId(initId++);
		}

		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getDepId()));
		employees.put(employee.getId(), employee);
	}

	// 查询所有员工
	public Collection<Employee> getAll() { return employees.values();}

	public Employee get(Integer id) { return employees.get(id); }

	public void delete(Integer id) { employees.remove(id); }

}
