package com.example.backend.objects;

public class Users {


	private String username;
	private String profile;
	
	public Users(User userName2, Bio profile2) {}
	
	public Users( String username, String profile) {
	
		
		this.username = username;
		this.profile = profile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", profile=" + profile + "]";
	}}
