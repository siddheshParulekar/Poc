package com.example.dao;




import java.util.List;

import com.example.model.Employee;


public interface EmployeeDao {

	public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployee();
    public  Employee getEmployeeById(int id);
    public void deleteEmployee(int id);
	
	

}
