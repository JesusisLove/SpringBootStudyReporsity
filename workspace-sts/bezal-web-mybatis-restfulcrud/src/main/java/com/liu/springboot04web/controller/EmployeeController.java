package com.liu.springboot04web.controller;
/* EmployeeController
* 专门用来处理与员工相关的请求
*
* */

import com.liu.springboot04web.dao.DepartmentDao;
import com.liu.springboot04web.dao.EmplyeeDao;
import com.liu.springboot04web.bean.Department;
import com.liu.springboot04web.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmplyeeDao emplyeeDao;
    @Autowired
    DepartmentDao departmentDao;

    // 点击sidebar里的【Bazel 员工管理】按钮，查询所有员工信息，并跳转到员工列表显示页面
    @GetMapping("/emps") //👈dashboard.html页面发来的请求（因为是GET，所以是一个查询请求）
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

    // 2020/07/30 当点击【员工添加】按钮时，来到员工添加页面
    @GetMapping("/emp") //👈list.html页面，点击【员工添加】按钮发来的请求（因为是GET，所以是一个查询请求）
    public String toAddEmp(Model model) {
        Collection<Department> departmentCollection = departmentDao.getDepartments();
        // 放在请求域中进行共享，使得可以在页面那里取得这些信息
        model.addAttribute("depts", departmentCollection);

        // 来到员工添加页面
        return "empolyees/emp_add_update";//empinfo//"empolyees/addemp"
    }

    // 2020/07/30 在添加员工页面里点击【添加】按钮，执行员工添加操作
    /* SpringMVC自动将请求参数和入参对象的属性值进行一一绑定；
    * 绑定要求：请求参数的名字和javaBen入参对象里的属性名必须一致
    * 例如：请求参数（emp_add_update.html）
    *       <input name="lastName" type="text" class="form-control" placeholder="zhangsan">
    *      入参对象（Employee.java）的属性名
    *       private String lastName;
    * */
    @PostMapping("/emp") //👈addemp.html页面，点击【添加】按钮发来的请求（因为是POST，所以是一个追加请求）
    public String doEmpAdd(Employee employee,Model model) {
        System.out.println("" + employee);
        // 执行员工保存操作
        emplyeeDao.save(employee);
        // 重定向到员工列表显示页面
        return "redirect:/emps";
    }
    /*
    *     忘记了转发和重定向的定义，在此复习
    * 转发是服务器行为，重定向是客户端行为。
    * forward是服务器请求资源,服务器直接访问目标地址的URL,把那个URL的响应内容读取过来,然后把这些内容再发给浏览器.
    * redirect是服务端根据逻辑,发送一个状态码,告诉浏览器重新去请求那个地址.
    * 想详细研究SpringBoot框架如何进行转发/重定向，参看源代码 ThymeleafViewResolver.java
    *                                                👉createView()方法
    * */

    // 2020/07/31 在员工列表显示页面里点击【编辑】按钮，抽取员工信息，并来到修改员工页面
    @GetMapping("/emp/{id}") //👈addemp.html页面，点击【编辑】按钮发来的请求（因为是GET，所以是一个查询请求，而且还带了员工id参数）
    public String doEmpEdit(@PathVariable("id") Integer id,Model model) {
        // 取出当前员工的信息
        Employee employee = emplyeeDao.get(id);
        // 因为查询的员工要在页面上回显，所以将取得的信息收纳在model里面
        model.addAttribute("selectedemp", employee);
        Collection<Department> departmentCollection = departmentDao.getDepartments();

        // 放在请求域中进行共享，使得可以在页面那里取得这些信息
        model.addAttribute("depts", departmentCollection);

        return "empolyees/emp_add_update";//empinfo//"empolyees/addemp"
    }

    // 2020/07/31 在修改员工页面里，点击【修改】按钮，执行员工信息更新操作
    /* SpringMVC自动将请求参数和入参对象的属性值进行一一绑定；
     * 绑定要求：请求参数的名字和javaBen入参对象里的属性名必须一致
     * 例如：请求参数（emp_add_update.html）
     *       以选择新的下拉列表框的控件为例：
     *       <select class="form-control" name="department.depId">
     *      入参对象（Employee.java）的属性名
     *       private String department;
     * */
    @PutMapping("/emp")
    public String updateEmployee(@ModelAttribute Employee employee) {
        System.out.println("修改的员工数据：" + employee.toString());
        emplyeeDao.save(employee);
        return "redirect:/emps";
    }

    // 2020/08/01 在员工列表显示页面里点击【删除】按钮，执行员工信息删除操作
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        System.out.println("删除了员工的数据" );
        emplyeeDao.delete(id);
        return "redirect:/emps";
    }

}
