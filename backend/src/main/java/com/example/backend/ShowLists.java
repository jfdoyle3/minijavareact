package com.example.backend;

import java.util.List;

import com.example.backend.data.BioData;
import com.example.backend.data.UserData;
import com.example.backend.objects.Bio;
import com.example.backend.objects.User;

public class ShowLists {

	public static void main(String[] args) {
		
		List<User> users=UserData.userList();
		List<Bio> bios=BioData.bioList();
		for(User user: users) {
			System.out.println(user);
		}
		System.out.println();
		for(Bio bio: bios) {
			System.out.println(bio);
		}
		
		

	}

}
