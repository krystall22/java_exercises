package com.abstraction;

public class Rectangle extends Shape {

	public double length;
	public double width;

	public Rectangle() {
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void getArea() {
		double area = length * width;
		System.out.println("The area of the rectangle: " + area);
	}

	@Override
	public void getPerimeter() {
		double perimeter = 2 * (length + width);
		System.out.println("The perimeter of the rectangle: " + perimeter);
	}
}
