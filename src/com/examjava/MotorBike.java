package com.examjava;

public class MotorBike extends Vehicle {
	String capacity;

	public MotorBike() {
		super();
	}

	public MotorBike(String capacity) {
		super();
		this.capacity = capacity;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

}
