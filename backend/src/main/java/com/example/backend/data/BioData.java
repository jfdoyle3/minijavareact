package com.example.backend.data;

import java.util.ArrayList;
import java.util.List;

import com.example.backend.objects.Bio;
import com.example.backend.objects.User;

public class BioData extends User{

	private static List<Bio> userBio=new ArrayList<>();

	
	public static List<Bio> bioList(){
		
		String bio1="Bio1";
		String bio2="Bio2";
		
	
			Bio bioA=new Bio(bio1);
			Bio bioB=new Bio(bio2);
			userBio.add(bioA);
			userBio.add(bioB);
			
			return userBio;
		}
	
}
		
	

