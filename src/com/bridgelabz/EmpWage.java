package com.bridgelabz;

class Employee {
	static final int IS_FULL_TIME_PRESENT = 1;
	static final int IS_PART_TIME_PRESENT = 2;
	static final int TOTAL_WORKING_HRS = 100;
	static final int TOTAL_WORKING_DAYS = 20;
	static final int WAGE_PER_HR = 20;
	int workingHrs;
	int totalWorkingHrs;
	int totalWorkingDays;
	int salary;
	int totalSalary;
	int empCheck = (int) Math.floor(Math.random() * 10) % 3;

	/**
	 * This is employee Attendance method to check whether He is full time present
	 * or part time present or absent
	 */
	public void employeeAttendance() {
		if (empCheck == IS_FULL_TIME_PRESENT) {
			System.out.println("Employee is full Time Present");
			workingHrs = 8;
		} else if (empCheck == IS_PART_TIME_PRESENT) {
			System.out.println("Employee is part Time present");
			workingHrs = 4;
		} else {
			System.out.println("Employee is absent");
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

	/**
	 * Employee wage computation using switch case
	 */
	public void empWageCaseMethod() {
		while (totalWorkingHrs < TOTAL_WORKING_HRS && totalWorkingDays < WAGE_PER_HR) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME_PRESENT:
				System.out.println("Employee is full Time Present");
				workingHrs = 8;
				break;
			case IS_PART_TIME_PRESENT:
				System.out.println("Employee is part Time present");
				workingHrs = 4;
				break;
			default:
				System.out.println("Employee is absent");
				workingHrs = 0;
			}
			totalWorkingHrs +=workingHrs;
			totalWorkingDays++;
			salary = workingHrs * WAGE_PER_HR;
			totalSalary += salary;
		}
	}
}

public class EmpWage {
	/**
	 * @param args This is Main method having Welcome message
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		Employee employee = new Employee();
		employee.empWageCaseMethod();
		System.out.println("salary : " + employee.salary + "rs\n" + "Totalsalary : " + employee.totalSalary + "rs");
		
	}
}
