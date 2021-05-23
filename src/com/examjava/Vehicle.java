package com.examjava;

public class Vehicle {
	private String identification;
	private String numberPlate;
	private String manufacturer;
	private int yearOfManufacture;
	private String color;

	public Vehicle() {
		super();
	}

	public Vehicle(String identification, String numberPlate, String manufacturer, int yearOfManufacture,
			String color) {
		super();
		this.identification = identification;
		this.numberPlate = numberPlate;
		this.manufacturer = manufacturer;
		this.yearOfManufacture = yearOfManufacture;
		this.color = color;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
