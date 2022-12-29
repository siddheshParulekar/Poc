package com.poc.service;

import com.poc.dao.EmployeeDAO;
import com.poc.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDAO employeeDAO;
    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDAO.getAllEmployee();
    }

    @Transactional
    @Override
    public Employee get(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    @Transactional
    @Override
    public void delete(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
