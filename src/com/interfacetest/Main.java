package com.interfacetest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input the length: ");
		double length = in.nextDouble();
		System.out.print("Please input the width: ");
		double width = in.nextDouble();
		System.out.print("Please input the radius: ");
		int radius = in.nextInt();

		IShape rec = new Rectangle(length, width);
		rec.getArea();
		rec.getPerimeter();

		IShape cir = new Circle(radius);
		cir.getArea();
		cir.getPerimeter();
		
		
	}

}
