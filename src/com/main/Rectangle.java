package com.main;

import java.util.Scanner;

public class Rectangle {
	static float length;
	static float width;

	public Rectangle() {
	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public static void main(String[] args) {
		getInformation();
		display(length, width);

	}

	public static void getInformation() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input the length of the rectangle: ");
		length = in.nextFloat();
		System.out.print("Please input the width of the rectangle: ");
		width = in.nextFloat();
	}

	public static void getArea(float length, float width) {
		Rectangle re = new Rectangle(length, width);
		float area = re.length * re.width;
		System.out.println("The area of the rectangle: " + area);
	}

	public static void getPerimeter(float length, float width) {
		Rectangle re = new Rectangle(length, width);
		float perimeter = 2 * (re.length + re.width);
		System.out.println("The perimeter of the rectangle: " + perimeter);
	}

	public static void display(float length, float width) {
		getArea(length, width);
		getPerimeter(length, width);
	}

}
