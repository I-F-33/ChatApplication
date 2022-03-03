package com.devflores.chatapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devflores.chatapp.domain.User;
import com.devflores.chatapp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User saveuser(User user) {
		return userRepo.saveUser(user);
	}

	public Boolean checkIfUserExists (User user) {
		return userRepo.checkIfExists(user);
	}
}
