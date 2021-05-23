package com.person;

public class Student extends Person {
	private int id;
	private int math;
	private int physic;
	private int average;

	public Student() {

	}

	public Student(String name, int age, int id, int math, int physic, int average) {
		super(name, age);
		this.id = id;
		this.math = math;
		this.physic = physic;
		this.average = average;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getPhysic() {
		return physic;
	}

	public void setPhysic(int physic) {
		this.physic = physic;
	}

	public int getAverage() {
		// average = (math + physic)/2;
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	/*
	 * public void display(Student student) { System.out.println("Name: " +
	 * student.getName()); System.out.println("Age: " + student.getAge());
	 * System.out.println("Math: " + student.getMath());
	 * System.out.println("Physic: " + student.getPhysic());
	 * System.out.println("Average: " + student.getAverage()); }
	 */
}
