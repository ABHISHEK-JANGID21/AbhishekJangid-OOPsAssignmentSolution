package com.greatlearning.department;

class HrDepartment extends SuperDepartment {
	HrDepartment() {
		System.out.println("Welcome to HR Department");
	}

	String departmentName() {
		return "Hr Department";
	}

	String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}

	String getWorkDeadline() {
		return "Complete by EOD";
	}

	String doActivity() {
		return "team Lunch";
	}
}