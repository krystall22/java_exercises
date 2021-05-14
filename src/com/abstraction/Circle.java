package com.abstraction;

public class Circle extends Shape {

	public int radius;

	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void getArea() {
		double areaOfCircle = radius * radius * 3.14;
		System.out.println("The area of the circle: " + areaOfCircle);
	}

	@Override
	public void getPerimeter() {
		double perimeterOfCircle = 2 * radius * 3.14;
		System.out.println("The perimeter of the circle: " + perimeterOfCircle);
	}
}
