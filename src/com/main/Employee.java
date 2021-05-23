package com.main;

import java.util.Scanner;

public class Employee {
	static String name;
	static int age;

	public Employee() {
	}

	public Employee(String name) {
	}

	public Employee(int age) {
	}

	public Employee(String name, int age) {
	}

	public static void main(String[] args) {

		getInformation();
		display(name, age);
	}

	public static void getInformation() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input your name: ");
		name = in.next();
		System.out.print("Please input your age: ");
		age = in.nextInt();
	}

	public static void display(String name, int age) {
		Employee e = new Employee(name, age);
		System.out.print("\nGet Information: " + e.name + " " + e.age);
	}
}
