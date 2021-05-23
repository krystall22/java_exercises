package com.employeemanage;

public class Office {
	private int idOffice;
	private String name;
	private String location;
	private int numberOfEmployee;

	public Office() {
		super();
	}

	public Office(int idOffice, String name, String location, int numberOfEmployee) {
		super();
		this.idOffice = idOffice;
		this.name = name;
		this.location = location;
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getIdOffice() {
		return idOffice;
	}

	public void setIdOffice(int idOffice) {
		this.idOffice = idOffice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

}
