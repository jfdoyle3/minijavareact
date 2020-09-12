package com.example.backend.data;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.objects.User;

public class UserEntityData {

	private static List<User> UserEntityList= new ArrayList<>();

	public static List<User> UserEntityList() {

		String firstName1 = "firstname1Entity";
		String lastName1 = "lastname1";
		String firstName2 = "firstnameEntity2";
		String lastName2 = "lastname2";

		User UserEntityA = new User(firstName1,lastName1);
		User UserEntityB = new User(firstName2,lastName2);
		UserEntityList.add(UserEntityA);
		UserEntityList.add(UserEntityB);

		return UserEntityList;
	}

}