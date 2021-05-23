package com.main;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

	static String name;
	static float mathScore;
	static float physicsScore;
	static float chemistryScore;

	public Student() {

	}

	public Student(String name, float mathScore, float physicsScore, float chemistryScore) {
	}

	public static void main(String[] args) {
	//	float[][] arr = createStudentsArray();
	//	display(arr);
	}

	public static int inputNoOfStudents() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input the number of students: ");
		int a = in.nextInt();

		return a;
	}

	public static float[] createStudentsArray() {
		Scanner in = new Scanner(System.in);
		int a = inputNoOfStudents();
		float[] arr = new float[a];
		System.out.print("Name ");
		System.out.print(" Math " + " Physics " + " Chemistry ");
		for (int i = 0; i < arr.length; i++) {
			
		
		}
		return arr;
	}

	public static void getInformation() {
		Scanner in = new Scanner(System.in);
		//System.out.print("Please input Student's name and grades: ");
		name = in.next();
		mathScore = in.nextFloat();
		physicsScore = in.nextFloat();
		chemistryScore = in.nextFloat();
				
	}

	public static float getAverage(float[] arr) {
		Student student = new Student(name, mathScore, physicsScore, chemistryScore);
		float average = (student.mathScore + student.physicsScore + student.chemistryScore) / 3;

		return average;

	}

	public static void display(float[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}