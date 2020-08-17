package com.liu.springboot04web.mapper;
/*
* EmployeeMapper是采用xml文件配置的方式访问数据库

* application.yml配置文件里做如下配置
* mybatis:
*  config-location: classpath:mybatis/mybatis-config.xml
*  mapper-locations: classpath:mybatis/mapper/*.xml

* resources → mabatis → mapper： 新规一个文件起名叫EmployeeMapper.xml
*             该文件里存放的是执行数据库增删改查的SQL文
* */

import com.liu.springboot04web.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //因为在SpringBoot06DataMybatisApplication处注解了@MapperScan，此处就可以不需要再注解@Mapper了😊
// 扫描该接口，并装配到容器中
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
    public List<Employee> getEmpAll();
    public void updateEmp(Employee employee);
    public void insertEmp(Employee employee);
    public void deleteEmp(Integer id);
}
