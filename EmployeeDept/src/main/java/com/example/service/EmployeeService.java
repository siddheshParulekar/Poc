package com.example.service;

import java.util.List;

import com.example.model.Employee;



public interface EmployeeService {

    List<Employee> get();

    Employee get (int id);

    Employee save(Employee employee);

    void delete(int id);

}
