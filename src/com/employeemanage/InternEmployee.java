package com.employeemanage;

public class InternEmployee extends Employee {
	private String major;
	private int workingHours;

	public InternEmployee() {
		super();

	}

	public InternEmployee(int id, String name, int idOffice, EmployeeType employeeType, int paymentPerHour, String major,
			int workingHours) {
		super(id, name, idOffice, employeeType, paymentPerHour);
		this.major = major;
		this.workingHours = workingHours;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public int calculatedSalary() {
		int calculatedSalaryIntern = getWorkingHours() * getPaymentPerHour();
		System.out.println("The calculated salary for fresher employee: " + calculatedSalaryIntern);
		return calculatedSalaryIntern;
	}

}
