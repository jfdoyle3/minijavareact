package com.example.backend.data;

import java.util.ArrayList;
import java.util.List;

import com.example.backend.objects.User;

public class UserData {

	private static List<User> users = new ArrayList<>();

	public static List<User> userList() {

		String user1 = "user1";
		String user2 = "user2";

		User userA = new User(1, user1);
		User userB = new User(2, user2);
		users.add(userA);
		users.add(userB);

		return users;
	}

}
