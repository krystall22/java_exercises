package com.abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the length: ");
		double length = input.nextDouble();
		System.out.print("Please input the width: ");
		double width = input.nextDouble();
		System.out.print("Please input the radius: ");
		int radius = input.nextInt();

		Shape rect = new Rectangle(length, width);
		rect.getArea();
		rect.getPerimeter();

		Shape circ = new Circle(radius);
		circ.getArea();
		circ.getPerimeter();
	}

}
