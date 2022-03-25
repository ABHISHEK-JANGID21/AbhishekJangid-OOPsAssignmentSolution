package com.greatlearning.department;

class AdminDepartment extends SuperDepartment {
	AdminDepartment() {
		System.out.println("Welcome to Admin Department");
	}

	String departmentName() {
		return "Admin Department";
	}

	String getTodaysWork() {
		return "Complete your documents Submission";
	}

	String getWorkDeadline() {
		return "Complete by EOD";
	}
}