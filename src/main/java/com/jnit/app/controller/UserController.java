package com.jnit.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jnit.app.model.User;
import com.jnit.app.services.UserService;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping
	public User create(@RequestBody User user){
		return userService.createUser(user);
	}
	
	@PutMapping
	public User update(@RequestBody User user){
		return userService.updateUser(user);
	}
	
	@DeleteMapping(path="/{userId}")
	public ResponseEntity<HttpStatus>deleteUser(@PathVariable("userId")Long userId){
		userService.deleteUser(userId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
