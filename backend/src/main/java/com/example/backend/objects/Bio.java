package com.example.backend.objects;

public class Bio {
	private int id;
	private String description;
	public Bio() {}
	
	public Bio(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Bio [id=" + id + ", description=" + description + "]";
	}

	
	
}
