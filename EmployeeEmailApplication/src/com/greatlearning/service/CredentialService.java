package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.EmployeeDetails;

public class CredentialService {
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String strNumbers = "0123456789";
		String splCharacters = "!@#$%^&*()_+";
		
		String strValues = capitalLetters+smallLetters+strNumbers+splCharacters;
		
		Random rd = new Random();
		
		char [] password = new char[8];
		for(int i=0;i<8;i++) {
			password[i] = strValues.charAt(rd.nextInt(strValues.length()));
		}
		return password;
	}
	
	public String generateEmailId(String firstName, String lastName, String department) {
		String emailID = firstName+lastName+"@"+department+".xyz.com";
		
		return emailID;
	}
	
	public void showCredentials(EmployeeDetails empDetails, String emailId, char[] password) {
		System.out.println("Dear "+ empDetails.getFirstName()+" "+ empDetails.getLastName()+" your generated credentials are as follows");
		System.out.println("Email ---> "+ emailId);
		System.out.println("Password ---> ");
		System.out.println(password);
	}
}
