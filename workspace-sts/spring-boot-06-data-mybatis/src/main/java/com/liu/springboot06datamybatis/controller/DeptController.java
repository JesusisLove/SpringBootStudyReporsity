package com.liu.springboot06datamybatis.controller;

import com.liu.springboot06datamybatis.bean.Department;
import com.liu.springboot06datamybatis.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/* 学习采用@Mapper注解的方式访问数据库 */
@RestController //不返回页面，只返回json数据
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return  departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDep(Department dept) {
        departmentMapper.insertDept(dept);
        return dept;
    }
}
