package com.person;

public class Teacher extends Person {
	int salary;

	public Teacher() {
	}

	public Teacher(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void display(Teacher teacher) {
		System.out.println("Name: " + teacher.getName());
		System.out.println("Age: " + teacher.getAge());
		System.out.println("Salary: " + teacher.getSalary());
	}
}
