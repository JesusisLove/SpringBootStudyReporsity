package com.liu.springboot06datajpa.controller;

import com.liu.springboot06datajpa.entity.Customer;
import com.liu.springboot06datajpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    // 从数据库表bazel_customer表 查询指定的客户信息
    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable("id") Integer id) {
        Customer customer = customerRepository.getOne(id);
        return customer;
    }

    // 往数据库表bazel_customer表里插入一个新的客户信息
    @GetMapping("/customer")
    public Customer insertCustomer(Customer customer) {
        Customer savedCus = customerRepository.save(customer);
        return savedCus;
    }
}

