package com.example.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.objects.User;
import com.example.entity.repository.UserRepository;


@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	public List<User> saveUserList(List<User> users) {
		return repository.saveAll(users);
	}
	public List<User> getUserList(){
		return repository.findAll();
	}
	public User getUserById(int id){
		return repository.findById(id).orElse(null);
	}
	public User getUserFirstName(String first_name){
		return repository.findByFirstName(first_name);
	}
	
	public String deleteUser(int id) {
		 repository.deleteById(id);
		return "User "+id+" deleted !!";
	}
	public User updateUserName(User user) {
		User existingUser=repository.findById(user.getId()).orElse(null);
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		return repository.save(existingUser);
	}

}

