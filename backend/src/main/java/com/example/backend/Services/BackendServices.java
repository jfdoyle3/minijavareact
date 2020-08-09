package com.example.backend.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.data.BioData;
import com.example.backend.data.UserEntityData;
import com.example.backend.entity.objects.UserEntity;
import com.example.backend.objects.Bio;
import com.example.backend.objects.User;


@Service
public class BackendServices {

	public List<UserEntity> findAllUsers() {
		return UserEntityData.UserEntityList();
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
