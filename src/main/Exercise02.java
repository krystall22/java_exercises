package main;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please input your first name: ");
		String firstName = input.next();

		System.out.println("Please input your last name: ");
		String lastName = input.next();

		System.out.println();
		System.out.println("Hello " + firstName + " " + lastName);

	}

}
