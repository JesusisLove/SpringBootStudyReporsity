package com.liu.springboot04web.bean;

public class Department {
	private Integer depId;
	private String departmentName;

	public Department() {}
	public Department(Integer id, String departmentName) {
		// super();
		this.depId = id;
		this.departmentName = departmentName;
	}

	public Integer getDepId() { return depId; }
	public void setDepId(Integer depid) { this.depId = depid; }

	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [id=" + depId + ", departmentName=" + departmentName + "]";
	}
	

}
