package com.clothico.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothico.entities.User;
import com.clothico.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User createUser(User user) {
		
		return userRepository.save(user);
	}

}
