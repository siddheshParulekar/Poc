package com.poc.service;

import com.poc.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> get();

    Employee get (int id);

    void save(Employee employee);

    void delete(int id);

}
