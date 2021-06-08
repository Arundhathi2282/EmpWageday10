package com.bridgelabz;

class Employee {
	static final int IS_PRESENT = 1;
	static final int WAGE_PER_HR = 20;
	int workingHrs;
	int salary;
	int empCheck = (int) Math.floor(Math.random() * 10) % 2;

	/**
	 * This is employee Attendance method to check whether He is present or absent
	 */
	public void employeeAttendance() {
		if (empCheck == IS_PRESENT) {
			System.out.println("Present");
			workingHrs = 8;
		} else {
			System.out.println("Absent");
			workingHrs = 0;
		}
	}

	/**
	 * @return Employee salary method to calculate salary of an employee
	 */
	public int empSalary() {
		employeeAttendance();
		salary = workingHrs * WAGE_PER_HR;
		return salary;
	}
}

public class EmpWage {
	/**
	 * @param args This is Main method having Welcome message
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		Employee employee = new Employee();
		employee.empSalary();
		System.out.println(employee.salary);
	}
}
