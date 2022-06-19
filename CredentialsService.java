package com.lab.services;

import java.util.Random;

import com.lab.model.Employee;

public class CredentialsService {

	public String generatePassword()
	{
		int first=(int) '!'; //33
		int last=(int) '~';  //126
		
		int range=last-first; 
		
		
		Random random=new Random();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<8;i++)
		{
			int randomNumber=random.nextInt(range);
			randomNumber=randomNumber+first;
		
			char randomCharacter=(char) randomNumber;
			sb.append(randomCharacter);
		}
		return sb.toString();
		
	}
	
	public String generateEmailAddress(Employee employee,String department)
	{
		String email=String.format("%s%s@%s.company.com",employee.getFirstName(),employee.getLastName(),department);
		return email;
	}
    public void showCredentials(String firstName,String password,String email)
    {
    	System.out.printf("Dear %s your generated credentials are as follows \n"
    			+ "Email ---> %s \n"
    			+ "Password ---> %s ",firstName,email,password);
    }
}
