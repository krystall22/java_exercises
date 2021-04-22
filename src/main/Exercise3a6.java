package main;

import java.util.Scanner;

public class Exercise3a6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Vui long nhap so nguyen a: ");
		int a = input.nextInt();
		System.out.print("Vui long nhap so nguyen b: ");
		int b = input.nextInt();

		for (int i = a; i <= b; i++) {
			if (i % 3 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
