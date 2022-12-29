 package com.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.entities.User;
import com.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> createUser(@RequestBody User user){
		
		User user1 = service.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
		
	}
	
	@GetMapping("/getByID")
	public ResponseEntity<User> getSingleUser(@RequestParam String userId){
	User user=	service.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAllUser(){
	List<User> allUser = 	service.getAllUser();
	return ResponseEntity.ok(allUser);
	}

}
