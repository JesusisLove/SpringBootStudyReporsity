package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
/* 2020/08/11 学习Springboot整合 Spring Data JPA */
// 使用JPA注解配置映射关系
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity // 告诉JPA当前的类Employee是一个实体类（和数据表映射的类）
@Table(name = "bezal_customer") // @Table来指定和哪个数据表相对应；如果省略该注解，默认的表明就是类名的小写
public class Customer {
    @Id // 标注id是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)// 主键值采用自动采番机制
    private Integer id;

    @Column(name="cus_name",length = 50)
    private String cusName;

    @Column(name="cus_email",length = 50)
    private String cusEmail;

    @Column // 如果属性名与表字段名一致就可以这么写
    private Integer gender;// 1 male, 0 famale

    @Column
    private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
