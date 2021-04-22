package main;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please input your age: ");
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("Your age is larger than or equal to 18");
		} else {
			System.out.println("You age is less than 18");
		}

	}

}
