package com.poc.controller;

import com.poc.entity.Employee;
import com.poc.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @GetMapping("/getAll")
    public List<Employee> get(){
        return employeeServiceImpl.get();
    }

    @PostMapping("/add")
    public Employee save(@RequestBody Employee employeeObj){
        employeeServiceImpl.save(employeeObj);
        return employeeObj;
    }

    @GetMapping("/getById/{id}")
    public  Employee get(@PathVariable int id){
        Employee employeeObj = employeeServiceImpl.get(id);
        if (employeeObj == null){
            throw new RuntimeException("Employee with id " + id + " is not found");
        }
        return employeeServiceImpl.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        employeeServiceImpl.delete(id);
        return "Employee has been deleted with id: " + id;
    }
}
