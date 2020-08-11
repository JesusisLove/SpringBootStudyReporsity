package com.liu.springboot06datamybatis.mapper;
/*
* EmployeeMapper是采用xml文件配置的方式访问数据库

*application.yml配置文件里做如下配置
*mybatis:
*  config-location: classpath:mybatis/mybatis-config.xml
*  mapper-locations: classpath:mybatis/mapper/*.xml

*resources → mabatis → mapper： 新规一个文件起名叫EmployeeMapper.xml


 * */

import com.liu.springboot06datamybatis.bean.Employee;

// @Mapper 因为在SpringBoot06DataMybatisApplication处注解了@MapperScan，此处就可以不需要再注解@Mapper了😊
// 扫描该接口，并装配到容器中
public interface EmployeeMapper {

    public Employee getEmtById(Integer id);

    public void insertEmy(Employee employee);
}
