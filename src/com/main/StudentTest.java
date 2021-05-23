package com.main;

import java.util.Scanner;

public class StudentTest {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Input number of the students: ");
		int length = scanner.nextInt();
		Student1[] studentArr = new Student1[length];
		for (int i = 0; i < studentArr.length; i++) {
			System.out.println("Input student " + i);
			studentArr[i] = getInformation(studentArr[i]);
		}

		for (int i = 0; i < studentArr.length; i++) {
			System.out.print("\nInfo Student " + i);
			display(studentArr[i]);
		}

		Student1 studentMax1 = findStudentMax(studentArr);
		System.out.println("Student Max Name: " + studentMax1.name);
		System.out.println("Student Max Score: " + studentMax1.average);
		

	}

	public static Student1 getInformation(Student1 student1) {
		student1 = new Student1();
		System.out.println("Input name: ");
		student1.name = scanner.next();
		System.out.print("Input math: ");
		student1.math = scanner.nextInt();
		System.out.print("Input physic: ");
		student1.physic = scanner.nextInt();
		System.out.print("Input chemistry: ");
		student1.chemistry = scanner.nextInt();
		student1.average = (student1.math + student1.physic + student1.chemistry) / 3;
		return student1;
	}

	public static void display(Student1 student1) {
		System.out.println("Name " + student1.name);
		System.out.println("Math " + student1.math);
		System.out.println("Physic " + student1.physic);
		System.out.println("Chemistry " + student1.chemistry);
		System.out.println("Average " + student1.average);
	}

	public static Student1 findStudentMax(Student1[] studentArr) {
		Student1 studentMax = studentArr[0]; // int max = arr[0];
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i].average > studentMax.average) {
				studentMax = studentArr[i];
			}
		}
		return studentMax;

	}

}
