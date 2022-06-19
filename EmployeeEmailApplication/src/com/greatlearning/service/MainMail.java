package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.EmployeeDetails;

public class MainMail {

	public static void main(String[] args) {
		char[] password;
		String generateEmailid = " ";
		Scanner sc = new Scanner(System.in);
		CredentialService credentialService = new CredentialService();
		EmployeeDetails empDetails = new EmployeeDetails("John", "Doe");
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int options = sc.nextInt();
		
		if (options == 1 ) {
			generateEmailid = credentialService.generateEmailId(empDetails.getFirstName(), empDetails.getLastName(), "Technical");
		} else if (options == 2) {
			generateEmailid = credentialService.generateEmailId(empDetails.getFirstName(), empDetails.getLastName(), "Admin");
		} else if (options == 3) {
			generateEmailid = credentialService.generateEmailId(empDetails.getFirstName(), empDetails.getLastName(), "HR");
		} else if (options == 4) {
			generateEmailid = credentialService.generateEmailId(empDetails.getFirstName(), empDetails.getLastName(), "Legal");
		} else {
			System.out.println("Please enter valid data");
		}
		
		password = credentialService.generatePassword();
		credentialService.showCredentials(empDetails, generateEmailid, password);
		
		sc.close();
	}

}
