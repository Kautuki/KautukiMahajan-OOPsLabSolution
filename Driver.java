package com.lab;

import java.util.Scanner;

import com.lab.model.Employee;
import com.lab.services.CredentialsService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     
		Employee emp=new Employee("Kautuki","Mahajan");
		System.out.println("Please enter the department: \n"
				+ "1.Technical \n"
				+ "2.Admin \n"
				+ "3.Human Resource \n"
				+ "4.Legal");
		
		int n=sc.nextInt();
		String dept="";
		switch(n)
		{
		case 1: 
			dept="Technical";
			break;
		case 2: 
			dept="Admin";
			break;
		case 3: 
			dept="Human Resource";
			break;
		case 4: 
			dept="Legal";
			break;
			default:
				throw new IllegalArgumentException("Wrong Input"+n);
			
		}
		
		CredentialsService cs=new CredentialsService();
		String firstname=emp.getFirstName();
		String email=cs.generateEmailAddress(emp, dept);
		String password=cs.generatePassword();
		cs.showCredentials(firstname,password,email);
	}

}
