package main;

import java.util.Scanner;

public class Exercise3a7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Vui long nhap so nguyen n: ");
		int n = input.nextInt();

		int factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.print(factorial + " ");
	}

}
