package com.example.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repo.EmloyeeRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class EmployeeServiceImpl {

  
	  @Autowired
	 private EmloyeeRepo employeeRepo;
	  
	  public Optional<Employee> getByName( String name) {
		  Optional<Employee> list = Optional.of(employeeRepo.findByname(name));
	        return list;
	    }

	    
	    public void save(Employee employee) {
	       //.addEmployee(employee);
	    	employeeRepo.save(employee);
	    }

	   
	    public void delete(String name) {
//	        employeeDAO.deleteEmployee(id);
	    	employeeRepo.deleteByname(name);
	    }

		
		public Employee update( Employee employee) {
			// TODO Auto-generated method stub
			
			employeeRepo.save(employee);
			return null;
		}

	  
	   
	    public List<Employee> getPagi(int pageNumber,int paeSize ) {
	       // return employeeDAO.getAllEmployee();
	    	//int paeSize=5;
	    	//int pageNumber=1;
	    	
	    	Pageable  pageable = PageRequest.of(pageNumber, paeSize);
	    	Page<Employee> pagepost = employeeRepo.findAll(pageable);
	    	List<Employee> content = pagepost.getContent();
	    	//List<Employee> emplist= employeeRepo.findAll();
	    	return content;
	    }
}
