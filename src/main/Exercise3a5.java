package main;

import java.util.Scanner;

public class Exercise3a5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Vui long nhap so nguyen n: ");
		int n = input.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				continue;
			}
			sum = sum + i;
		}
		System.out.print(sum + " ");
	}

}
