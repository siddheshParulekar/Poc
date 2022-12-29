package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "empId")
	private Integer id;
	
	@Column(name = "empName")
	private String name;
	
	@Column(name = "empDept")
	private  String department;

	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(Integer id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
	

}
