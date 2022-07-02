package com.gl.driver;

import com.gl.departments.AdminDepartment;
import com.gl.departments.HRDepartment;
import com.gl.departments.TechDepartment;

public class Main {

	public static void main(String args[])
	{
		AdminDepartment adm=new AdminDepartment();
		System.out.println(String.format("Welcome to %s", adm.departmentName()));
		System.out.println(adm.getTodaysWork());
		System.out.println(adm.getWorkDeadline());
		System.out.println(adm.isTodayAHoliday());
		
		System.out.println("\n");
		
		HRDepartment hr=new HRDepartment();
		System.out.println(String.format("Welcome to %s", hr.departmentName()));
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println("\n");
		
		TechDepartment tech=new TechDepartment();
		System.out.println(String.format("Welcome to %s", tech.departmentName()));
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
}
}
