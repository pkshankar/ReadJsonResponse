package com.qa.pojo;

public class User {

	private boolean authorized;
	private Guest guest;

	public User(boolean authorized, Guest guest) {
		this.authorized = authorized;
		this.guest = guest;
	}

	public User() {

	}

	public boolean isAuthorized() {
		return authorized;
	}

	public Guest getGuest() {
		return guest;
	}

}
