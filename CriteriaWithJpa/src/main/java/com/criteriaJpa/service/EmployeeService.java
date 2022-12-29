package com.criteriaJpa.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.criteriaJpa.entities.Department1;
import com.criteriaJpa.entities.Employee1;



public interface EmployeeService {
	 List<Employee1> getAll();
	 List<Employee1> getAllNative();

	    Employee1 getById(int id);

//	    void save(Employee employee);

	    void deleteById(int id);
	    
	    Employee1 update (Employee1 employee);
	    void save(Employee1 dept);

		List<Employee1> getByName(String name);

		List<Employee1> getByAgeGtE(int age);

		List<Employee1> getAllOrderby();

		List<Employee1> getAllOrderbyAsc();

		List<Employee1> pagenatin(int pagenumber, int pagesize);

		List<Employee1> getByAgebetweeen(int age1, int age2);

		List<Employee1> sortByfield(String field);
//		Employee1 getByIdJpql(int id);
		Employee1 getByIdJpql(int id);

}
