package com.example.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Department implements Serializable {
	
//	private static final long SerialVersionUID=10l;

	private int dept_id;
	private String dept_Name;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int dept_id, String dept_Name) {
		super();
		this.dept_id = dept_id;
		this.dept_Name = dept_Name;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_Name() {
		return dept_Name;
	}
	public void setDept_Name(String dept_Name) {
		this.dept_Name = dept_Name;
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_Name=" + dept_Name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept_Name, dept_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(dept_Name, other.dept_Name) && dept_id == other.dept_id;
	}
	
	

}

