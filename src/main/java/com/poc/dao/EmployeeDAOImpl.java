package com.poc.dao;

import com.poc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {


    @Autowired
    HibernateTemplate hibernateTemplate;

    public void addEmployee(Employee employee){
        hibernateTemplate.save(employee);
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
