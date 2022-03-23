package com.gl.oops.adminDepartment;

import com.gl.oops.superDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "Admin department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
