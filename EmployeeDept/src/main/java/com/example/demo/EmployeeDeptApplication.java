package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Employee;

@SpringBootApplication
public class EmployeeDeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDeptApplication.class, args);
		
		
		
		Employee e1 = new Employee(1,"Umesh","Java");
	}

}
