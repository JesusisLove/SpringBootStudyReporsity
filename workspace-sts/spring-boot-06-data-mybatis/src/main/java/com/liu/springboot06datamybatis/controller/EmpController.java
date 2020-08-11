package com.liu.springboot06datamybatis.controller;

import com.liu.springboot06datamybatis.bean.Department;
import com.liu.springboot06datamybatis.bean.Employee;
import com.liu.springboot06datamybatis.mapper.DepartmentMapper;
import com.liu.springboot06datamybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //不返回页面，只返回json数据
public class EmpController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/empl/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {
        return  employeeMapper.getEmtById(id);
    }

//    @GetMapping("/empl")
//    public Department insertDep(Department dept) {
//        employeeMapper.insertDept(dept);
//        return dept;
//    }
}
