package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity // 告诉JPA当前的类Employee是一个实体类（和数据表映射的类）
@Table(name = "bezal_department") // @Table来指定和哪个数据表相对应；如果省略该注解，默认的表明就是类名的小写
public class Department {
	@Id // 标注id是主键
	@GeneratedValue(strategy = GenerationType.IDENTITY)// 主键值采用自动采番机制
	@Column(name="dep_id")
	private Integer depid;
	@Column(name="department_name",length = 50)
	private String departmentName;
}
