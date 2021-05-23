package com.examjava;

public class Car extends Vehicle {
	int numberOfSeat;
	String typeOfEngine;

	public Car() {
		super();
	}

	public Car(int numberOfSeat, String typeOfEngine) {
		super();
		this.numberOfSeat = numberOfSeat;
		this.typeOfEngine = typeOfEngine;
	}

	public int getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public String getTypeOfEngine() {
		return typeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}

}
