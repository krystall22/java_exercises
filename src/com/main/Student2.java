package com.main;

import java.util.Scanner;

public class Student2 {
	static String name;
	static int math;
	static int physic;
	static int chemistry;
	static int average;
	static Scanner input = new Scanner(System.in);

	public Student2() {

	}

	public Student2(String name, int math, int physic, int chemistry, int average) {
		this.name = name;
		this.math = math;
		this.physic = physic;
		this.chemistry = chemistry;
		this.average = average;
	}

	public static Student2 getInformation(Student2 student) {
		student = new Student2();
		System.out.print("Student name: ");
		student.name = input.next();
		System.out.print("Math point: ");
		student.math = input.nextInt();
		System.out.print("Physic point: ");
		student.physic = input.nextInt();
		System.out.println("Chemistry point: ");
		student.chemistry = input.nextInt();
		student.average = (student.math + student.physic + student.chemistry) / 3;
		return student;
	}

	public static int getAverage(int math, int physic, int chemistry) {
		int average = (math + physic + chemistry) / 3;
		return average;
	}

	public static void display(Student2 student) {
		System.out.println("Student name: " + student.name);
		System.out.println("Math point: " + student.math);
		System.out.println("Physic point: " + student.physic);
		System.out.println("Chemistry point: " + student.chemistry);
		System.out.println("Average point: " + student.average);
	}

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		System.out.print("Number of Student: ");
		int numberofStudent = input.nextInt();
		Student2[] studentArr = new Student2[numberofStudent];
		for(int i = 0;i < studentArr.length;i++) {
		studentArr[i] = getInformation(studentArr[i]);
		}
		for(int i = 0;i < studentArr.length;i++) {
		display(studentArr[i]);
		}
	}
}
