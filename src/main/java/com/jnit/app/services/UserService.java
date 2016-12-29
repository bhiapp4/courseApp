package com.jnit.app.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnit.app.model.User;
import com.jnit.app.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user){
		user.setCreatedDateTime(LocalDateTime.now());
		user.setUpdatedDateTime(LocalDateTime.now());
		return userRepository.save(user);
	}
	
	public User updateUser(User user){
		user.setUpdatedDateTime(LocalDateTime.now());
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public void deleteUser(Long userId) {
		userRepository.delete(userId);
	}

}
