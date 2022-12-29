package com.userservice.service;

import java.util.List;

import com.userservice.entities.User;

public interface UserService {
	
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String UserId);
	
	void deleteUser(String UserId);

}
