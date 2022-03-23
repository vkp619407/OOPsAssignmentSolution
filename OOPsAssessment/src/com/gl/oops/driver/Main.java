package com.gl.oops.driver;

import com.gl.oops.adminDepartment.AdminDepartment;
import com.gl.opps.hrDepartment.HrDepartment;
import com.gl.opps.techDepartment.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment adminObj = new AdminDepartment();
		System.out.println("Welcome to "+adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday()+"\n");
		
		HrDepartment hrObj = new HrDepartment();
		System.out.println("Welcome to "+hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());		
		System.out.println(hrObj.isTodayAHoliday()+"\n");
		
		
		
		TechDepartment techObj = new TechDepartment();
		System.out.println("Welcome to "+techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());
	}

}
