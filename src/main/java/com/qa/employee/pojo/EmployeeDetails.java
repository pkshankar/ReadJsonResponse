package com.qa.employee.pojo;

public class EmployeeDetails {

	public String firstName;
	public String lastName;
	public int age;

	public EmployeeDetails(String firstName, String lastName, int age) {

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
