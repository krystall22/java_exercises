package com.examjava;

import java.time.YearMonth;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		VehicleOwner vehicleOwner = new VehicleOwner();
		VehicleOwner[] vehicleOwner1 = getVehicleOwnerList(vehicleOwner);
		findDuplicateId(vehicleOwner1);
		Vehicle vehicle = new Vehicle();
		Vehicle[] vehicle1 = getVehicleList(vehicle);
		outputVehicleOwnerByNumberPlate(vehicleOwner1, vehicle1);
		outputVehicleByID(vehicle1);
		outputVehicleGreater9Years(vehicle1);
		getNumberOfVehicleByDistrict(vehicle1);

	}

	public static void getNumberOfVehicleByDistrict(Vehicle[] vehicleArr) {
		int numberOfVehiclesInD1 = 0;
		int numberOfVehiclesInD2 = 0;
		int numberOfVehiclesInD10 = 0;
		int numberOfOtherDistricts = 0;
		for (int i = 0; i < vehicleArr.length; i++) {
			if (vehicleArr[i].getNumberPlate().substring(3, 5).equals("T1")
					|| vehicleArr[i].getNumberPlate().substring(3, 5).equals("T2")) {
				numberOfVehiclesInD1++;
			} else if (vehicleArr[i].getNumberPlate().substring(3, 5).equals("B1")) {
				numberOfVehiclesInD2++;
			} else if (vehicleArr[i].getNumberPlate().substring(3, 5).equals("U1")
					|| vehicleArr[i].getNumberPlate().substring(3, 5).equals("U2")) {
				numberOfVehiclesInD10++;
			} else {
				numberOfOtherDistricts++;
			}
		}
		System.out.print("\nNumber of vehicles in Q1: " + numberOfVehiclesInD1);
		System.out.print("\nNumber of vehicles in Q2: " + numberOfVehiclesInD2);
		System.out.print("\nNumber of vehicles in Q10: " + numberOfVehiclesInD10);
		System.out.print("\nNumber of vehicles in other districts: " + numberOfOtherDistricts);

	}

	public static Vehicle[] outputVehicleGreater9Years(Vehicle[] vehicleArr) {
		System.out.println("All vehicles more than 10 years are: ");
		int currentYear = YearMonth.now().getYear();
		for (int i = 0; i < vehicleArr.length; i++) {
			if ((currentYear - vehicleArr[i].getYearOfManufacture()) >= 10) {
				displayVehicle(vehicleArr[i]);
			}
		}
		return vehicleArr;

	}

	public static Vehicle[] outputVehicleByID(Vehicle[] vehicleArr) {
		System.out.print("\nPlease input ID you want to see the ID's vehicles list:");
		String id = input.next();
		for (int i = 0; i < vehicleArr.length; i++) {
			if (vehicleArr[i].getIdentification().equals(id)) {
				displayVehicle(vehicleArr[i]);
			}
		}
		return vehicleArr;
	}

	public static VehicleOwner[] outputVehicleOwnerByNumberPlate(VehicleOwner[] vehicleOwnerArr, Vehicle[] vehicleArr) {
		System.out.print("\nPlease input number plate you want to see vehicle owner info: ");
		String numberPlate = input.next();
		for (int i = 0; i < vehicleArr.length && i < vehicleOwnerArr.length; i++) {
			if (vehicleArr[i].getNumberPlate().equals((numberPlate))) {
				displayVehicleOwner(vehicleOwnerArr[i]);
			}
		}
		return vehicleOwnerArr;
	}

	public static VehicleOwner[] getVehicleOwnerList(VehicleOwner vehicleOwner) {
		System.out.print("Please input number of vehicle owners: ");
		int length = input.nextInt();
		VehicleOwner[] vehicleOwnerArr = new VehicleOwner[length];
		for (int i = 0; i < vehicleOwnerArr.length; i++) {
			vehicleOwnerArr[i] = inputVehicleOwnerInfo(vehicleOwnerArr[i]);
		}

		for (int i = 0; i < vehicleOwnerArr.length; i++) {
			displayVehicleOwner(vehicleOwnerArr[i]);
		}
		return vehicleOwnerArr;
	}

	public static Vehicle[] getVehicleList(Vehicle vehicle) {
		System.out.print("Please input number of vehicles: ");
		int length = input.nextInt();
		Vehicle[] vehicleArr = new Vehicle[length];
		for (int i = 0; i < vehicleArr.length; i++) {
			vehicleArr[i] = inputVehicle(vehicleArr[i]);
		}
		for (int i = 0; i < vehicleArr.length; i++) {
			displayVehicle(vehicleArr[i]);
		}
		return vehicleArr;

	}

	public static VehicleOwner[] findDuplicateId(VehicleOwner[] vehicleOwnerArr) {
		for (int i = 0; i < vehicleOwnerArr.length; i++) {
			for (int j = i + 1; j < vehicleOwnerArr.length; j++) {
				if (j != i && vehicleOwnerArr[j].getIdentification().equals(vehicleOwnerArr[i].getIdentification())) {
					System.out.println("Found duplicate ID: ");
					displayVehicleOwner(vehicleOwnerArr[j]);
					displayVehicleOwner(vehicleOwnerArr[i]);
					System.out.println("Please change first duplicate ID found");
					vehicleOwnerArr[j] = inputVehicleOwnerInfo(vehicleOwnerArr[j]);
				}
			}
		}
		System.out.println("Return list after checking duplicate: ");
		for (int i = 0; i < vehicleOwnerArr.length; i++) {
			displayVehicleOwner(vehicleOwnerArr[i]);
		}
		return vehicleOwnerArr;
	}

	public static boolean isEmailValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
		return email.matches(emailRegex);
	}

	public static VehicleOwner inputVehicleOwnerInfo(VehicleOwner vehicleOwner) {
		vehicleOwner = new VehicleOwner();
		boolean isIdValid = false;
		boolean isEmailFormat = false;

		do {
			System.out.print("Please input ID: ");
			String id = input.next();
			int b = id.length();
			if (b == 10) {
				isIdValid = true;
				vehicleOwner.setIdentification(id);
			} else {
				System.out.print("The ID must contain 10 numbers. Please input it again!\n");
			}
		} while (!isIdValid);

		System.out.print("Please input ID name: ");
		String name = input.next();
		vehicleOwner.setName(name);

		do {
			System.out.print("Please input email: ");
			String email = input.next();
			if (isEmailValid(email)) {
				isEmailFormat = true;
				vehicleOwner.setEmail(email);
			} else {
				System.out.println("Wrong email format. Please input it again!");
			}
		} while (!isEmailFormat);
		return vehicleOwner;
	}

	public static VehicleOwner displayVehicleOwner(VehicleOwner vehicleOwner) {
		System.out.printf("ID:%10s |" + "ID name:%15s |" + "Email:%20s |\n", vehicleOwner.getIdentification(),
				vehicleOwner.getName(), vehicleOwner.getEmail());
		return vehicleOwner;

	}

	public static Vehicle inputVehicle(Vehicle vehicle) {
		vehicle = new Vehicle();
		boolean isNumberPlateValid = false;
		boolean isColorValid = false;
		boolean isManufacturerValid = false;
		boolean isYearOfManufactureValid = false;
		boolean isIdValid = false;

		do {
			System.out.print("Please input ID: ");
			String id = input.next();
			int b = id.length();
			if (b == 10) {
				isIdValid = true;
				vehicle.setIdentification(id);
			} else {
				System.out.print("The ID must contain 10 numbers. Please input it again!\n");
			}
		} while (!isIdValid);

		do {
			System.out.print("Please input number plate: ");
			String numberPlate = input.next();
			int b1 = numberPlate.length();
			if (b1 == 12 && (numberPlate.substring(0, 1).equals("5") || numberPlate.substring(0, 2).equals("41"))) {
				isNumberPlateValid = true;
				vehicle.setNumberPlate(numberPlate);
			} else {
				System.out.println("Wrong number plate format. The number must start 5 or 41 and contain 12 numbers");
			}
		} while (!isNumberPlateValid);

		do {
			System.out.print("Please input vehicle's color: ");
			String color = input.next();
			for (VehicleColorInfo vColor : VehicleColorInfo.values()) {
				if (color.equals(vColor.toString())) {
					isColorValid = true;
					vehicle.setColor(color);
				}
			}
			if (!isColorValid) {
				System.out.println(
						"Wrong input vehicle's color. Please input one of these colors: TRANG, DO, XANH, DEN, NAU, VANG!");
			}
		} while (!isColorValid);

		do {
			System.out.print("Please input vehicle's manufacturer: ");
			String manufacturer = input.next();
			for (VehicleManufacturer vManufacturer : VehicleManufacturer.values()) {
				if (manufacturer.equals(vManufacturer.toString())) {
					isManufacturerValid = true;
					vehicle.setManufacturer(manufacturer);
				}
			}
			if (!isManufacturerValid) {
				System.out.println(
						"Wrong input vehicle's manufacturer. Please input one of these manufacturers: HONDA, YAMAHA, SUZUKI, KIA, MAZDA, HUYNDAI, VINFAST!");
			}
		} while (!isManufacturerValid);

		do {
			System.out.print("Please input year of vehicle's manufacturer: ");
			int yearOfManufacture = input.nextInt();
			int currentYear = YearMonth.now().getYear();
			if ((currentYear - yearOfManufacture) <= 20) {
				isYearOfManufactureValid = true;
				vehicle.setYearOfManufacture(yearOfManufacture);
			} else {
				System.out.println("The year of manufacture is greater than 20 years. Please input it again!");
			}
		} while (!isYearOfManufactureValid);

		return vehicle;
	}

	public static Vehicle displayVehicle(Vehicle vehicle) {
		System.out.printf(
				"\nID:%10s |" + "Number Plate:%13s |" + "Color:%6s |" + "Manufacturer:%8s |"
						+ "Year of Manufacture:%5d |",
				vehicle.getIdentification(), vehicle.getNumberPlate(), vehicle.getColor(), vehicle.getManufacturer(),
				vehicle.getYearOfManufacture());
		return vehicle;

	}

}
