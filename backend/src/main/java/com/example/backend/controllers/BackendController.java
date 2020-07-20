package com.example.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Services.BackendServices;
import com.example.backend.objects.Bio;
import com.example.backend.objects.User;

@RestController
// @CrossOrigin(origins = "http://localhost:3000")
public class BackendController {

	@Autowired
	BackendServices backendServices;

	// GET: All Users
	@GetMapping("/userlist")
	public List<User> getAllUsers() {
		return backendServices.findAllUsers();
	}

	// GET: All Bios
	@GetMapping("/biolist")
	public List<Bio> getAllBios(){
			return backendServices.findAllBios();
	}
	
	// Get: Get by id
	@GetMapping("/user/{name}")
	public User getByName(@PathVariable String name) {
		return backendServices.findByName(name);
		
	}
	}