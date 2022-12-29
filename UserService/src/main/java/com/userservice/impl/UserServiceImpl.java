package com.userservice.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userservice.entities.User;
import com.userservice.exception.ResourceNotFound;
import com.userservice.repositories.UserRepoitory;
import com.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepoitory repoitory;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return repoitory.save(user);
		
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repoitory.findAll();
	}

	@Override
	public User getUser(String UserId) {
		// TODO Auto-generated method stub
		return repoitory.findById(UserId).orElseThrow(() -> new ResourceNotFound("User with given id not found"));
	}

	@Override
	public void deleteUser(String UserId) {
		// TODO Auto-generated method stub
		
	}

}
