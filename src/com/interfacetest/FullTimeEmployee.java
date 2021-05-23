package com.interfacetest;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee() {
	}

	public FullTimeEmployee(String name, int paymentPerHour) {
		super.setName(name);
		super.setPaymentPerHour(paymentPerHour);
	}

	@Override
	public int calculateSalary() {
		int calculatedSalaryFullTime = 8 * getPaymentPerHour();
		System.out.println("The calculated salary for full-time employee: " + 8 * getPaymentPerHour());
		return calculatedSalaryFullTime;
	}

}
