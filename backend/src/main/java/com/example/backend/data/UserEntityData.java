package com.example.backend.data;

import java.util.ArrayList;
import java.util.List;

import com.example.backend.entity.objects.UserEntity;

public class UserEntityData {

	private static List<UserEntity> UserEntityList= new ArrayList<>();

	public static List<UserEntity> UserEntityList() {

		String firstName1 = "firstname1Entity";
		String lastName1 = "lastname1";
		String firstName2 = "firstnameEntity2";
		String lastName2 = "lastname2";

		UserEntity UserEntityA = new UserEntity(firstName1,lastName1);
		UserEntity UserEntityB = new UserEntity(firstName2,lastName2);
		UserEntityList.add(UserEntityA);
		UserEntityList.add(UserEntityB);

		return UserEntityList;
	}

}