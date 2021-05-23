package com.person;

import java.util.Scanner;

public class StudentArray {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Student student = new Student();
		Student[] studentArr = inputStudentInfo(student);
		findStudentByID(studentArr);
		Student[] newStudentArr = insertStudentIntoArray(studentArr);
		Student[] editStudentArr = editStudentInfo(newStudentArr);
		Student[] sortStudentArr = deleteStudentByID(editStudentArr);
		sortStudentByAverage(sortStudentArr);

	}

	public static Student[] inputStudentInfo(Student student) {
		System.out.print("Input number of the students: ");
		int s = in.nextInt();
		Student[] studentArr = new Student[s];
		for (int i = 0; i < studentArr.length; i++) {
			// System.out.println("Input Student: " + i);
			studentArr[i] = getStudentInfo(studentArr[i]);
		}

		for (int i = 0; i < studentArr.length; i++) {
			System.out.println("Output Student: " + i);
			displayStudentInfo(studentArr[i]);

		}
		return studentArr;

	}

	public static Student getStudentInfo(Student student) {
		//student = new Student();
		System.out.print("Enter Student ID: ");
		int id = in.nextInt();
		student.setId(id);
		System.out.print("Enter Student Name: ");
		String name = in.next();
		student.setName(name);
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

	public static void displayStudentInfo(Student student) {
		System.out.printf("Student Id:%5d |" + "Student Name:%5s |" + "Math:%3d |" + "Physic:%3d |" + "Average:%3d |\n",
				student.getId(), student.getName(), student.getMath(), student.getPhysic(), student.getAverage());
	}

	public static void findStudentByID(Student[] studentArr) {
		System.out.println();
		System.out.print("Enter Student ID you want to find: ");
		int id = in.nextInt();
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i].getId() == id) {
				displayStudentInfo(studentArr[i]);
			}
		}

	}

	public static Student[] insertStudentIntoArray(Student[] studentArr) {
		int length = studentArr.length;
		Student[] newStudentArr = new Student[length + 1];
		for (int i = 0; i < newStudentArr.length; i++) {
			if (i < length) {
				newStudentArr[i] = studentArr[i];
			} else {
				newStudentArr[i] = getStudentInfo(newStudentArr[i]);
			}
		}
		for (int i = 0; i < newStudentArr.length; i++) {
			displayStudentInfo(newStudentArr[i]);
		}
		return newStudentArr;
	}

	public static Student[] editStudentInfo(Student[] studentArr) {
		System.out.println();
		System.out.print("Enter Student Id you want to edit: ");
		int id = in.nextInt();

		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i].getId() == id) {
				studentArr[i] = getStudentInfo(studentArr[i]);
			}
		}
		System.out.println();
		System.out.println("Student Info after editing: ");
		for (int i = 0; i < studentArr.length; i++) {
			displayStudentInfo(studentArr[i]);

		}
		return studentArr;
	}

	public static Student[] deleteStudentByID(Student[] studentArr) {
		System.out.println("\nEnter Student ID you want to delete: ");
		int id = in.nextInt();
		Student[] newStudentArr = new Student[studentArr.length - 1];
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i].getId() == id) {
				int k = i;
				for (int j = 0; j < studentArr.length; j++) {
					if (j < k) {
						newStudentArr[j] = studentArr[j];
					} else if (j == k) {
						continue;
					} else {
						newStudentArr[j - 1] = studentArr[j];
					}
				}
			}
		}
		for (int i = 0; i < newStudentArr.length; i++) {
			displayStudentInfo(newStudentArr[i]);
		}

		return newStudentArr;
	}

	public static Student[] sortStudentByAverage(Student[] studentArr) {
		for (int i = 0; i < studentArr.length - 1; i++) {
			for (int j = 1; j < studentArr.length; j++) {
				if (studentArr[i].getAverage() > studentArr[j].getAverage()) {
					Student[] temp = new Student[1];
					temp[0] = studentArr[i];
					studentArr[i] = studentArr[j];
					studentArr[j] = temp[0];
				}
			}
		}
		System.out.println();
		System.out.println("Sort Student By Average: ");
		for (int i = 0; i < studentArr.length; i++) {
			displayStudentInfo(studentArr[i]);
		}
		return studentArr;
	}
}
