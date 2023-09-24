package com.myapp;

public class userRole{
	private User user;
	private Role role;
	
	public userRole(User user, Role role) {
		this.user = user;
		this.role = role;
	}
	
	public User getUser() {
		return user;
	}
	
	public Role getRole() {
		return role;
	}
}