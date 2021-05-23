package com.examjava;

public class Truck extends Vehicle {
	int loadCapacityl;

	public Truck() {
		super();
	}

	public Truck(int loadCapacityl) {
		super();
		this.loadCapacityl = loadCapacityl;
	}

	public int getLoadCapacityl() {
		return loadCapacityl;
	}

	public void setLoadCapacityl(int loadCapacityl) {
		this.loadCapacityl = loadCapacityl;
	}
}
