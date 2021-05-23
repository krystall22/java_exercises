package com.employeemanage;

public class FresherEmployee extends Employee {
	private char graduationRank;

	public FresherEmployee() {
		super();
	}

	public FresherEmployee(int id, String name, int idOffice, EmployeeType employeeType, int paymentPerHour,
			char graduationRank) {
		super(id, name, idOffice, employeeType, paymentPerHour);
		this.graduationRank = graduationRank;
	}

	public char getGraduationRank() {
		return graduationRank;
	}

	public void setGraduationRank(char graduationRank) {
		this.graduationRank = graduationRank;
	}

	public int calculatedSalary() {
		int calculatedSalaryFresher = 8 * getPaymentPerHour();
		System.out.println("The calculated salary for fresher employee: " + calculatedSalaryFresher);
		return calculatedSalaryFresher;
	}

}
