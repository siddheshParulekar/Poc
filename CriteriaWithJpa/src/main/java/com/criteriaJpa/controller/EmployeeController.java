package com.criteriaJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.criteriaJpa.entities.Department1;
import com.criteriaJpa.entities.Employee1;
import com.criteriaJpa.service.EmployeeService;

@RestController
@RequestMapping("/Criteria")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/addEmployee")
	public Employee1 addDepartment(@RequestBody Employee1 employee1) {

		employeeService.save(employee1);
		return employee1;

	}

	@GetMapping("/getAll")
	public List<Employee1> getAllDepartment() {
		return employeeService.getAll();

	}
	
	@GetMapping("/getById")
	public Employee1 getDepartmentById(@RequestParam int id) {
		return employeeService.getById(id);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public  void DeleteById(@PathVariable int id) {
		employeeService.deleteById(id);
		
	}
	
	
	@PutMapping("/updateById/{id}")
	public Employee1 UpdateById(@PathVariable int id, @RequestBody Employee1 employee1) {

		Employee1 tempEmp = employeeService.getById(id);
		tempEmp.setAge(employee1.getAge());
		tempEmp.setDepartment(employee1.getDepartment());
		employeeService.save(tempEmp);
		return tempEmp;

	}
	
	@GetMapping("/getByName/{name}")
	public List<Employee1> getByNamee(@PathVariable String name) {
		return employeeService.getByName(name);

	}
	@GetMapping("/getAge/{age}")
	public List<Employee1> getAgeGtEquals(@PathVariable int age) {
		return employeeService.getByAgeGtE(age);

	}
	
	@GetMapping("/getAllOrder")
	public List<Employee1> getAllOrder() {
		return employeeService.getAllOrderby();

	}
	
	@GetMapping("/getAllOrderAsc")
	public List<Employee1> getAllOrderAsc() {
		return employeeService.getAllOrderbyAsc();

	}
	
	
	@GetMapping("/getAllPagi")
	public List<Employee1> getAllEmployee(@RequestParam int pageNumber,@RequestParam int pageSize){
		return employeeService.pagenatin(pageNumber,pageSize );

	}
	
	@GetMapping("/getAgebwen/{age1}/{age2}")
	public List<Employee1> getEmpBetwwn(@PathVariable int age1,@PathVariable int age2) {
		return employeeService.getByAgebetweeen(age1, age2);

	}
	
	@GetMapping("/getAllsorted")
	public List<Employee1> getAllOrderAsc(@RequestParam String filed) {
		return employeeService.sortByfield(filed);

	}
	
	@GetMapping("/getAllNative")
	public List<Employee1> getAllNative() {
		return employeeService.getAllNative();

	}
	@GetMapping("/getByIdJpql")
	public Employee1 getByJpql(@RequestParam int id) {
		return employeeService.getByIdJpql(id);
	}
	
	

}
