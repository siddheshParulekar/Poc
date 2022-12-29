package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;

	@Transactional
	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.addEmployee(employee);
	
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(id);
	}

}
