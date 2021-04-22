package main;

import java.util.Scanner;

public class Exercise3a2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Vui long nhap so nguyen a: ");
		int a = input.nextInt();
		System.out.print("Vui long nhap so nguyen b: ");
		int b = input.nextInt();

		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}

}
