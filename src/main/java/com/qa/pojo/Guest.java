package com.qa.pojo;

public class Guest {

	private int chatNumber;
	private String username;
	private int guestId;
	private boolean primary;
	private boolean coppaRestricted;

	public Guest(int chatNumber, String username, int guestId, boolean primary, boolean coppaRestricted) {

		this.chatNumber = chatNumber;
		this.username = username;
		this.guestId = guestId;
		this.primary = primary;
		this.coppaRestricted = coppaRestricted;
	}

	public Guest() {

	}

	public int getChatNumber() {
		return chatNumber;
	}

	public String getUsername() {
		return username;
	}

	public int getGuestId() {
		return guestId;
	}

	public boolean isPrimary() {
		return primary;
	}

	public boolean isCoppaRestricted() {
		return coppaRestricted;
	}

}
