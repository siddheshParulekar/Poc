package com.criteriaJpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Employee_table")
public class Employee1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	private String gender;

	private int age;

	private String Department;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(int id, String name, String gender, int age, String department) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		Department = department;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", Department="
				+ Department + "]";
	}

}
