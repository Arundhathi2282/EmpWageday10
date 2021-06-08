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
	int numberOfWorkingDays;
	String company;

	public Employee(int workingHrs, String company, int numberOfWorkingDays) {
		for (int i = 0; i < numberOfWorkingDays; i++) {
			salary = workingHrs * WAGE_PER_HR;
			totalSalary += salary;
		}
		System.out.println("Total salary for " + numberOfWorkingDays + " working days in " + company + " is : "
				+ totalSalary + "rs");
	}

	/**
	 * Employee wage computation using switch case
	 */
	public void employeeWageComputation() {
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
			totalWorkingHrs += workingHrs;
			totalWorkingDays++;
			salary = workingHrs * WAGE_PER_HR;
			totalSalary += salary;
		}
		System.out.println("Totalsalary for " + numberOfWorkingDays + " days of " + company + " Company is : "
				+ totalSalary + "rs");
	}
}

public class EmpWage {
	/**
	 * @param args This is Main method having Welcome message
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		Employee employee1 = new Employee(10, "Dmart", 30);
		Employee employee2 = new Employee(15, "BigC", 25);
		Employee employee3 = new Employee(20, "Bata", 20);

	}
}
