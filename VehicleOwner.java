package com.examjava;

public class VehicleOwner {
	private String identification;
	private String name;
	private String email;

	public VehicleOwner() {
		super();
	}

	public VehicleOwner(String identification, String name, String email) {
		super();
		this.identification = identification;
		this.name = name;
		this.email = email;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
