package com.clothico.controller;

import org.springframework.web.bind.annotation.RestController;

import com.clothico.entities.User;
import com.clothico.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
     
	@PostMapping("/user")
	public User addUserDetails(@RequestBody User user) {
		
		
		return userService.createUser(user);
	}
	
	
}
