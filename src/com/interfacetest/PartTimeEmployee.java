package com.interfacetest;

public class PartTimeEmployee extends Employee {

	int workingHours;

	public PartTimeEmployee() {
	}

	public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
		super.setName(name);
		super.setPaymentPerHour(paymentPerHour);
		this.workingHours = workingHours;
	}

	@Override
	public int calculateSalary() {
		int calculatedSalaryPartTime = workingHours * getPaymentPerHour();
		System.out.println("The calculated salary for part-time employee: " + calculatedSalaryPartTime);
		return calculatedSalaryPartTime;
	}

}
