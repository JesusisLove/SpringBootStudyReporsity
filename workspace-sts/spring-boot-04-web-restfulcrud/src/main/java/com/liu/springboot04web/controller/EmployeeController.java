package com.liu.springboot04web.controller;
/* EmployeeController
* 专门用来处理与员工相关的请求
*
* */

import com.liu.springboot04web.dao.DepartmentDao;
import com.liu.springboot04web.dao.EmplyeeDao;
import com.liu.springboot04web.entities.Department;
import com.liu.springboot04web.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmplyeeDao emplyeeDao;
    @Autowired
    DepartmentDao departmentDao;

    //查询所有员工返回列表页面
    @GetMapping("/emps") // 映射dashboard.html页面发来的请求（因为是GET，所以是一个查询请求）
    public String list(Model model) {
        Collection<Employee> employeeCollection = emplyeeDao.getAll();

        // 放在请求域中进行共享，使得可以在页面那里取得这些信息
        model.addAttribute("emps", employeeCollection);
        /* thymeleaf模版引擎就会拼串，自动指定到类路径的【templates/】下，去找empolyees/list.html
                参看【ThymeleafProperties.java】
                       →【private String prefix = DEFAULT_PREFIX】
                            →【DEFAULT_PREFIX = "classpath:/templates/】
                       →【private String suffix = DEFAULT_SUFFIX;】
                            →【DEFAULT_SUFFIX = ".html"】;
        */
        return "empolyees/list";
    }

    // 当点击【员工添加】按钮时，来到员工添加页面
    @GetMapping("/emp")
    public String toAddEmp(Model model) {
        Collection<Department> departmentCollection = departmentDao.getDepartments();
        // 放在请求域中进行共享，使得可以在页面那里取得这些信息
        model.addAttribute("depts", departmentCollection);

        // 来到员工添加页面
        return "empolyees/addemp";
    }
}
