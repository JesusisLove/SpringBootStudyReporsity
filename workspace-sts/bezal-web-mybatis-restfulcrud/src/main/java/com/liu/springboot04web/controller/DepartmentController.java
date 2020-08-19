package com.liu.springboot04web.controller;
/* EmployeeController
* 专门用来处理与员工相关的请求
*
* */

import com.liu.springboot04web.bean.Department;
import com.liu.springboot04web.bean.Employee;
import com.liu.springboot04web.dao.DepartmentDao;
import com.liu.springboot04web.dao.EmplyeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class DepartmentController {

    @Autowired
    DepartmentDao departmentDao;

    // 点击sidebar里的【Bazel 员工管理】按钮，查询所有员工信息，并跳转到员工列表显示页面
    @GetMapping("/depts") //👈dashboard.html页面发来的请求（因为是GET，所以是一个查询请求）
    public String list(Model model) {
        Collection<Department> departmentCollection = departmentDao.getDepartments();

        // 放在请求域中进行共享，使得可以在页面那里取得这些信息
        model.addAttribute("deptsall", departmentCollection);
        /* thymeleaf模版引擎就会拼串，自动指定到类路径的【templates/】下，去找empolyees/departmentlist.html
                参看【ThymeleafProperties.java】
                       →【private String prefix = DEFAULT_PREFIX】
                            →【DEFAULT_PREFIX = "classpath:/templates/】
                       →【private String suffix = DEFAULT_SUFFIX;】
                            →【DEFAULT_SUFFIX = ".html"】;
        */
        return "departments/departmentlist";
    }

    // 2020/07/30 当点击【部门添加】按钮时，来到员工添加页面
    @GetMapping("/dept") //👈list.html页面，点击【员工添加】按钮发来的请求（因为是GET，所以是一个查询请求）
    public String toAddEmp(Model model) {
        Collection<Department> departmentCollection = departmentDao.getDepartments();
        // 放在请求域中进行共享，使得可以在页面那里取得这些信息
        model.addAttribute("depts", departmentCollection);

        // 来到员工添加页面
        return "departments/dept_add_update";
    }

    // 2020/07/30 在添加员工页面里点击【添加】按钮，执行员工添加操作
    /* SpringMVC自动将请求参数和入参对象的属性值进行一一绑定；
    * 绑定要求：请求参数的名字和javaBen入参对象里的属性名必须一致
    * 例如：请求参数（emp_add_update.html）
    *       <input name="lastName" type="text" class="form-control" placeholder="zhangsan">
    *      入参对象（Employee.java）的属性名
    *       private String lastName;
    * */
    @PostMapping("/dept") //👈addemp.html页面，点击【添加】按钮发来的请求（因为是POST，所以是一个追加请求）
    public String doEmpAdd(Department department) {
        System.out.println("" + department);

        // 执行员工保存操作
        departmentDao.save(department);
        // 重定向到员工列表显示页面
        return "redirect:/depts";
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
    @GetMapping("/dept/{id}") //👈addemp.html页面，点击【编辑】按钮发来的请求（因为是GET，所以是一个查询请求，而且还带了员工id参数）
    public String doEmpEdit(@PathVariable("id") Integer id,Model model) {
        // 因为查询的部门要在页面上回显，所以将取得的信息收纳在model里面
        Department department = departmentDao.getDepartment(id);

        // 放在请求域中进行共享，使得可以在页面那里取得这些信息
        model.addAttribute("selectedept", department);

        return "departments/dept_add_update";
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
    @PutMapping("/dept")
    public String updateEmployee(@ModelAttribute Department department) {
        System.out.println("修改的员工数据：" + department.toString());
        departmentDao.save(department);
        return "redirect:/depts";
    }

    // 2020/08/01 在员工列表显示页面里点击【删除】按钮，执行员工信息删除操作
    @DeleteMapping("/dept/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        System.out.println("删除了员工的数据" );
        departmentDao.delete(id);
        return "redirect:/depts";
    }

}
