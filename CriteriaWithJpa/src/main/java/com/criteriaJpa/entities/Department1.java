package com.criteriaJpa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Department_table")
public class Department1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int depId;
	
	private String deptName;
	
	//@OneToMany( cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@OneToMany( cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="DeptId")
	private List<Employee1> emplist;

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee1> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee1> emplist) {
		this.emplist = emplist;
	}

	public Department1(int depId, String deptName, List<Employee1> emplist) {
		super();
		this.depId = depId;
		this.deptName = deptName;
		this.emplist = emplist;
	}

	public Department1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", deptName=" + deptName + ", emplist=" + emplist + "]";
	}
	
	
	

}
