package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Department;
import com.example.model.Employee;

@Repository
public interface EmloyeeRepo extends JpaRepository<Employee, Department>{
	
//	Employee findByid(int id);
//	void deleteByid(int id);
	Employee findByname(String name);
	void deleteByname(String name);

}
