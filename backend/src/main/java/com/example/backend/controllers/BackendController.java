package com.example.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.services.UserServices;
import com.example.entity.objects.User;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BackendController {

	@Autowired
	private UserServices service;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users) {
		return service.saveUserList(users);
	}

	@GetMapping("/userlist")
	public List<User> findAllUsers() {
		return service.getUserList();
	}
	
	@GetMapping("/user/{id}")
	public User findUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	@GetMapping("/user/{name}")
	public User updateUser (@PathVariable String name) {
		return service.getUserFirstName(name);
	}
	
	@PutMapping("/update")
		public User updateUser(@RequestBody User user) {
		return service.updateUserName(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(int id) {
		return service.deleteUser(id);
		
	}
	
}