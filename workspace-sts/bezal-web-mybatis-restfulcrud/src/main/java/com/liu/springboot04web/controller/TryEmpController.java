package com.liu.springboot04web.controller;

import com.liu.springboot04web.bean.Employee;
import com.liu.springboot04web.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController //不返回页面，只返回json数据
public class TryEmpController {
    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emplall")
    public List<Employee> getAll() {
        return employeeMapper.getEmpAll();
    }
}
