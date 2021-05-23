package com.interfacetest;

public class MainEmployee {

	public static void main(String[] args) {
		IEmployee employee1 = new PartTimeEmployee("Tom", 45000, 7);
		employee1.calculateSalary();

		IEmployee employee2 = new FullTimeEmployee("John", 65000);
		employee2.calculateSalary();
	}

}
