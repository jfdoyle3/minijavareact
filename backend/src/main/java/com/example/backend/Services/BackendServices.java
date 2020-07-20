package com.example.backend.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.data.BioData;
import com.example.backend.data.UserData;
import com.example.backend.objects.Bio;
import com.example.backend.objects.User;


@Service
public class BackendServices {

	public List<User> findAllUsers() {
		return UserData.userList();
	}

	public List<Bio> findAllBios() {
		return BioData.bioList();
	}

	public User findByName(String name) {
		List<User> users = UserData.userList();
		for (User user : users) {
			if (user.getName().contentEquals(name)) {
				return user;
			}
		}
		return null;
	}
}
