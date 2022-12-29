package com.example.demo.controller;
 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AuthenticationRequest;
import com.example.demo.model.AutheticationResponse;
import com.example.demo.model.User;
import com.example.demo.service.MyUserDetailsService;
import com.example.demo.util.JwtUtil;


@RestController
public class HomeController {
	
	public static String myUsername;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	@Autowired
	private JwtUtil jwtTokenUtil;
	
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	
	@GetMapping("/user")
	public String user() {
		return "This is user page";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "This is admin page";
	}
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthentication(@RequestBody AuthenticationRequest authenticationRequest) throws Exception
	{
		 myUsername  =authenticationRequest.getUsername();
		try {
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword()));
		}catch(BadCredentialsException e) {
			throw new Exception("Incorrect username or password",e);
			
		}
		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());
		
		final String jwt  = jwtTokenUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AutheticationResponse(jwt));
	  
		
	}
	
	@RequestMapping(value="/registeruser")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmail=user.getUsername();
		User userObj = null;
		System.out.print(tempEmail +"");
		if(tempEmail != null && !"".equals(tempEmail)) {
			System.out.print("In registration");
			
			userObj=userDetailsService.saveuser(user);
			
//			Optional<User> userObj1= userDetailsService.findByUsername(tempEmail)
//					;
//			System.out.println("USER" +userObj1);
//			if(userObj1 != null) {
//				throw new Exception("User with" + tempEmail+"alreday exists");
//			}
//			System.out.print("In registration");
//			 userObj = null;
//			userObj=userDetailsService.saveuser(user);
		}
//		System.out.print("In registration");
//		User userObj = null;
//		userObj=userDetailsService.saveuser(user);
		return userObj;
	}
	 
	

}