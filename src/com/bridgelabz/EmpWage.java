package com.bridgelabz;

class Employee {
	static final int IS_FULL_TIME_PRESENT = 1;
	static final int IS_PART_TIME_PRESENT = 2;
	private static int wagePerHr;
	private static int numberOfWorkingHrs;
	private static int numberOfWorkingDays;
	private static String company;
	int totalSalary;

	public Employee(int wagePerHr, String company, int numberOfWorkingDays,int numberOfWorkingHrs) {
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.numberOfWorkingHrs = numberOfWorkingHrs;
		this.numberOfWorkingDays = numberOfWorkingDays;
	}

	/**
	 * Employee wage computation using switch case
	 */
	public void employeeWageComputation() {
		int workingHrs = 0,totalWorkingHrs=0,totalWorkingDays=0;
		while (totalWorkingHrs < numberOfWorkingHrs && totalWorkingDays < numberOfWorkingDays) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			totalWorkingDays++;
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
			totalSalary =  totalWorkingHrs * wagePerHr;
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
		Employee dMart = new Employee(20,"Dmart", 30,100);
		dMart.employeeWageComputation();
		Employee bigC = new Employee(15, "BigC", 25,80);
		bigC.employeeWageComputation();
		Employee bata = new Employee(20, "Bata", 20,90);
		bata.employeeWageComputation();

	}
}
