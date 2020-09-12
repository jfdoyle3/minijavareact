package com.example.backend.data;

import java.util.ArrayList;
import java.util.List;

import com.example.backend.objects.User;

public class UserData {

	private static List<User> users = new ArrayList<>();

	public static List<User> userList() {

		String firstName1 = "firstname1";
		String lastName1 = "lastname1";
		String firstName2 = "firstname2";
		String lastName2 = "lastname2";

		User userA = new User(firstName1,lastName1);
		User userB = new User(firstName2,lastName2);
		users.add(userA);
		users.add(userB);

		return users;
	}

}
