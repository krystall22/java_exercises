package com.person;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Student student = new Student();
		student = getStudentInformation(student);
		displayStudent(student);

		Teacher teacher = new Teacher();
		teacher = getTeacherInformation(teacher);
		displayTeacher(teacher);

	}

	public static Student getStudentInformation(Student student) {
		student = new Student();
		System.out.print("Enter Student Id: ");
		int id = in.nextInt();
		student.setId(id);
		System.out.print("Enter Student Name: ");
		String name = in.next();
		student.setName(name);
		System.out.print("Enter Student's Age: ");
		int age = in.nextInt();
		student.setAge(age);
		System.out.print("Enter Math: ");
		int math = in.nextInt();
		student.setMath(math);
		System.out.print("Enter Physic: ");
		int physic = in.nextInt();
		student.setPhysic(physic);

		int average = (student.getMath() + student.getPhysic()) / 2;
		student.setAverage(average);
		return student;
	}

	public static void displayStudent(Student student) {
		System.out.println("\nStudent Information: ");
		System.out.printf("ID:%3d| " + "Name:%5s| " + "Math:%2d| " + "Physic:%2d| " + "Average:%2d|\n", student.getId(),
				student.getName(), student.getMath(), student.getPhysic(), student.getAverage());
	}

	public static Teacher getTeacherInformation(Teacher teacher) {
		teacher = new Teacher();
		System.out.print("\nEnter Teacher Name: ");
		String name = in.next();
		teacher.setName(name);
		System.out.print("Enter Teacher's Age: ");
		int age = in.nextInt();
		teacher.setAge(age);
		System.out.print("Enter Teacher's Salary: ");
		int salary = in.nextInt();
		teacher.setSalary(salary);

		return teacher;
	}

	public static void displayTeacher(Teacher teacher) {
		System.out.println("\nTeacher Information: ");
		System.out.printf("Name:%7s| " + "Age:%3d| " + "Salary:%3d|\n ", teacher.getName(), teacher.getAge(),
				teacher.getSalary());

	}

}
