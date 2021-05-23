package com.employeemanage;

public class ExperiencedEmployee extends Employee {
	private int expInYear;

	public ExperiencedEmployee() {
		super();
	}

	public ExperiencedEmployee(int id, String name, int idOffice, EmployeeType employeeType, int paymentPerHour,
			int expInYear) {
		super(id, name, idOffice, employeeType, paymentPerHour);
		this.expInYear = expInYear;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public int calculatedSalary() {
		int calculatedSalaryFullTime = 8 * getPaymentPerHour();
		System.out.println("The calculated salary for full-time employee: " + calculatedSalaryFullTime);
		return calculatedSalaryFullTime;
	}

}
