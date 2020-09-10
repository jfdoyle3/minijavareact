package com.example.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.data.BioData;
import com.example.backend.data.UserEntityData;
import com.example.backend.objects.Bio;
import com.example.backend.objects.User;
import com.example.entity.crud.GetAllUsers;
import com.example.entity.objects.UserEntity;


@Service
public class BackendServices {
	

	public List<User> findAllUsers() {
		return GetAllUsers.AllUsers();
	}

	public List<Bio> findAllBios() {
		return BioData.bioList();
	}

	public UserEntity findByName(String name) {
		List<UserEntity> users = UserEntityData.UserEntityList();
		for (UserEntity user : users) {
			if (user.getFirstName().contentEquals(name)) {
				return user;
			}
		}
		return null;
	}
}
