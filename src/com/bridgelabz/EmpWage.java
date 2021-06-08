package com.bridgelabz;

class Employee {
	static final int IS_PRESENT = 1;
	int empCheck = (int) Math.floor(Math.random() * 10) % 2;
	
	/**
	 * This is employee Attendance method to check
	 * whether He is present or absent
	 */
	public void employeeAttendance() {
		if (empCheck == IS_PRESENT) {
			System.out.println("Present");
		}else {
			System.out.println("Absent");
		}
	}
}
public class EmpWage {
	/**
	 * @param args
	 * This is Main method having Welcome message
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		Employee employee = new Employee();
		employee.employeeAttendance();
	}
}
