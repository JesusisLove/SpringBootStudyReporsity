package com.liu.springboot04web.entities;

public class Department {
	private Integer id;
	private String departmentName;

	/* 2020/07/31 为什么写一个空的构造方法
	* 在addemp.html（添加新员工页面），点击【添加】按钮，提交表单时，要提交部门名称和部门id
	* 			<select class="form-control" name="department.id">
	* Springboot在提交表单数据进行Mapping映射时，对于级联对象的映射要先实例化Department，这就需要调用不带参数的构造方法，
	* 因为没有不带参数的构造方法，无法进行实例化，所以抛出异常。
	* 另外，不是说实例化一个对象，编译器会给一个默认的空的构造方法吗？不写也可以呀？回答：当实时运行new Department()时才会去调用默认的构造方法，这个场景下可以不用写。
	* 当一个对象被外部进行实例化时，需要些空的构造方法。
	*
	*There was an unexpected error (type=Internal Server Error, status=500).
	* Invalid property 'department' of bean class [com.liu.springboot04web.entities.Employee]:
	* Could not instantiate property type [com.liu.springboot04web.entities.Department] to auto-grow nested property path;
	* nested exception is java.lang.NoSuchMethodException: com.liu.springboot04web.entities.Department.<init>()
	* */
	public Department() {}

	public Department(Integer id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	

}
