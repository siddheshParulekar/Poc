package com.example.controller;




import com.example.model.Employee;
import com.example.service.EmployeeServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;
    
    @GetMapping("/")
    public String getHome(){
        return "Home";
    }

    @GetMapping("/getAll")
    public List<Employee> get(
    		@RequestParam(value="pageNumber",defaultValue="0",required = false) int pageNumber,
    		@RequestParam(value="pageSize",defaultValue="5",required = false) int pageSize
    		){
        return employeeServiceImpl.getPagi(pageNumber,pageSize);
    }

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employeeObj){
        employeeServiceImpl.save(employeeObj);
        return employeeObj;
    }

    @GetMapping("/getById/{name}")
    public  Optional<Employee> get(@PathVariable String name){
        Optional<Employee> employeeObj = employeeServiceImpl.getByName(name);
        System.out.println(employeeObj);
        if (employeeObj == null){
            throw new RuntimeException("Employee with id " + name + " is not found");
        }
        return employeeServiceImpl.getByName(name);
    }

    @DeleteMapping("/delete/{name}")
    public String delete(@PathVariable String name){
        employeeServiceImpl.delete(name);
        return "Employee has been deleted with name: " + name;
    }
    
   
//    @PutMapping("/update/{id}")
//    public Employee update(@PathVariable int id,@RequestBody Employee employeeObj) {
//    	
//    	
//    	Optional<Employee> oldemp =  employeeServiceImpl.get(id).;
////    	employeeServiceImpl.update(employeeObj);
////    	
//    	//stud.setStudent_name(student.getStudent_name());
//    	System.out.println("Hellooo");
//    	oldemp.setName(employeeObj.getName());
//    	oldemp.setGender(employeeObj.getGender());
//    //	oldemp.setDepartment(employeeObj.getDepartment());
//    	
//    	employeeServiceImpl.update(oldemp);
//    	
//    	return oldemp;
//    }
    
//    @Transactional
//    @PostMapping("/addDept")
//    public Department save(@RequestBody Department dept){
//    	dept.setDepId(dept.getDepId());
//        employeeServiceImpl.save(dept);
//        return dept;
//    }
//    
//    @GetMapping("/hcqlName")
//    public Object criteriaByName() {
//        return employeeServiceImpl.criteriaByName();
//    }
//
//    @GetMapping("/hcqlId/{id}")
//    public Object criteria(@PathVariable int id) {
//        return employeeServiceImpl.criteria(id);
//    }
    
//    @GetMapping("/getAllPagi")
//    public List<Employee> getPagi(){
//        return employeeServiceImpl.get();
//    }

    
}
