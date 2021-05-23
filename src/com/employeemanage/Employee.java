package com.employeemanage;

public abstract class Employee {
	private int id;
	private String name;
	private int idOffice;
	private EmployeeType employeeType;
	private int paymentPerHour;

	abstract int calculatedSalary();

	public Employee() {
		super();
	}

	public Employee(int id, String name, int idOffice, EmployeeType employeeType, int paymentPerHour) {
		super();
		this.id = id;
		this.name = name;
		this.idOffice = idOffice;
		this.employeeType = employeeType;
		this.paymentPerHour = paymentPerHour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdOffice() {
		return idOffice;
	}

	public void setIdOffice(int idOffice) {
		this.idOffice = idOffice;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

}
