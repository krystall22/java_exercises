package main;

import java.util.Scanner;

public class Exercise3a1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Vui long nhap so nguyen n: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}

}
