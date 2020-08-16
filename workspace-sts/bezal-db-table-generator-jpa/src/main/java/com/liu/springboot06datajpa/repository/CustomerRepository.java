package com.liu.springboot06datajpa.repository;

import com.liu.springboot06datajpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/* 2020/08/11 学习Springboot整合 Spring Data JPA
// 注意必须是一个interface
// 根据JpaRepository<T, ID> 的范型定义 （T extends Object，ID extends Object）
// 根据我们业务自身的需要，我们指定T的类型为Employee类型，
// ID指定为表主键id，因为id的类型是Integer，
// 所以最终写成=》JpaRepository<ustomer,Integer> */

// 继承JpaRepository来完成对数据库的操作
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
