package com.example.model;

import javax.persistence.*;


@Entity
public class Employee {

	@Id

	private int id;

	private String name;

	private String gender;

	@ManyToOne
	private Department department;
	
	

	public Employee(int id, String name, String gender, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department + "]";
	}

}
