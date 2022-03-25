package com.greatlearning.department;

public class TechDepartment extends SuperDepartment {
	TechDepartment() {
		System.out.println("Welcome to Tech Department");
	}

	String departmentName() {
		return "Tech Department";
	}

	String getTodaysWork() {
		return "Complete coding of module 1";
	}

	String getWorkDeadline() {
		return "Complete by EOD";
	}

	String getTechStackInformation() {
		return "core Java";
	}
}
