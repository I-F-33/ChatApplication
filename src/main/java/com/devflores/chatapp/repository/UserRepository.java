package com.devflores.chatapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.devflores.chatapp.domain.User;

@Repository
public class UserRepository {

	private List<User> users;
	
	public User saveUser(User user) {
		user.setUserId(users.size() + 1);
		users.add(user);
		return user;
	}
	
	public Boolean checkIfExists(User user) {
		return users.contains(user);
	}
	
	public User fetchUserById (Integer userId) {
		return users.get(userId-1);
	}
}
