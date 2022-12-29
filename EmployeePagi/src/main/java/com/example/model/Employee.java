package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE_tb")
//@IdClass(Department.class)
public class Employee {

	@EmbeddedId
	private Department department;
	private String name;

	private String gender;

//	@ManyToOne( cascade=CascadeType.ALL,fetch = FetchType.EAGER)
//
	
//	@Id
//	
//	private int deptId;
//	@Id
//	private String DeptName;

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public int getDeptId() {
//		return deptId;
//	}
//
//	public void setDeptId(int deptId) {
//		this.deptId = deptId;
//	}
//
//	public String getDeptName() {
//		return DeptName;
//	}
//
//	public void setDeptName(String deptName) {
//		DeptName = deptName;
//	}

	public Employee( String name, String gender, Department department) {
		super();
		
		this.name = name;
		this.gender = gender;
		this.department = department;
	}
	
	
//
	@Override
	public String toString() {
		return "Employee [ name=" + name + ", gender=" + gender + ", department=" + department + "]";
	}

//public Employee(int id, String name, String gender, int deptId, String deptName) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.gender = gender;
//	this.deptId = deptId;
//	DeptName = deptName;
//}
//
//@Override
//public String toString() {
//	return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", deptId=" + deptId + ", DeptName="
//			+ DeptName + "]";
//}


}
