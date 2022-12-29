package com.example.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.model.Employee;



public class EmployeeDaoImpl {
	
	@Autowired
    HibernateTemplate hibernateTemplate;

    public Serializable addEmployee(Employee employee){
       return  hibernateTemplate.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return hibernateTemplate.loadAll(Employee.class);
    }

    public  Employee getEmployeeById(int id){
        return hibernateTemplate.get(Employee.class, id);
    }

    public void deleteEmployee(int id){
        hibernateTemplate.delete(getEmployeeById(id));
    }

}
