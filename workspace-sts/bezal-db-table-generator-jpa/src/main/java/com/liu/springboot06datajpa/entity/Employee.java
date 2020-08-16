package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity // 告诉JPA当前的类Employee是一个实体类（和数据表映射的类）
@Table(name = "bezal_employee") // @Table来指定和哪个数据表相对应；如果省略该注解，默认的表明就是类名的小写
public class Employee {
    @Id // 标注id是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)// 主键值采用自动采番机制
    private Integer id;
    @Column(name="first_name",length = 50)
    private String firstName;
    @Column(name="last_name",length = 50)
    private String lastName;
    @Column
    private Integer gender;
    @Column
    private String email;
    @Column(name="birth_day")
    private Date birthDay;
    @Column(name="dep_id")
    private Integer depId;
}
