package com.main.employeemanage;

import java.util.Scanner;

import com.employeemanage.Employee;
import com.employeemanage.EmployeeType;
import com.employeemanage.Office;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Office office = new Office();
		addOfficeInfo(office);
		
	

	}

	public static Office addOfficeInfo(Office officeInfo) {
		System.out.print("Please input office ID: ");
		int idOffice = input.nextInt();
		officeInfo.setIdOffice(idOffice);
		System.out.print("Please input office name: ");
		String officeName = input.next();
		officeInfo.setName(officeName);
		System.out.print("Please input location: ");
		String officeLocation = input.next();
		officeInfo.setLocation(officeLocation);
		System.out.print("Please input number of employees: ");
		int numberOfEmployee = input.nextInt();
		officeInfo.setNumberOfEmployee(numberOfEmployee);

		return officeInfo;
	}

	public static Office displayOfficeList(Office office) {
		System.out.printf("Office ID:%3d |" + "Office Name:%7s |" + "Location:%5s |" + "Number of employees:%4d |\n",
				office.getIdOffice(), office.getName(), office.getLocation(), office.getNumberOfEmployee());
		return office;
	}

	public static Employee addEmployeeInfo(Employee employee) {
		boolean isEmployeeTypeValid = false;

		System.out.println("Please input employee ID: ");
		int idEmployee = input.nextInt();
		employee.setId(idEmployee);

		System.out.println("Please input employee name: ");
		String employeeName = input.nextLine();
		employee.setName(employeeName);

		System.out.println("Please input employee type: ");
		employee.setEmployeeType(EmployeeType.EXPERIENCED);

		System.out.println("Please input office Id: ");
		int idOffice = input.nextInt();
		employee.setIdOffice(idOffice);

		return employee;

	}
}
