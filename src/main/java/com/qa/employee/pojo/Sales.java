package com.qa.employee.pojo;

public class Sales {

//	private Details[] details;
//
//	public Sales(Details[] details) {
//
//		this.details = details;
//	}
//
//	public Details[] getDetails() {
//		return details;
//	}
	
	private String firstName;
	private String lastName;
	private int age;
	
	public Sales(String firstName, String lastName, int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
	
	
	
	

	
	

}
