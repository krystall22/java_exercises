package com.interfacetest;

public abstract class Employee implements IEmployee {

	String name;
	int paymentPerHour;

	public Employee() {
	}

	public Employee(String name, int paymentPerHour) {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

}
