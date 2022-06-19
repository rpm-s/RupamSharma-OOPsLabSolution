package com.greatlearning.model;

public class EmployeeDetails {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public EmployeeDetails(String FirstName, String LastName) {
		this.firstName = FirstName;
		this.lastName = LastName;
	}
}
