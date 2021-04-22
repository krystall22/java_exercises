package main;

import java.util.Scanner;

public class Exercise3a4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Vui long nhap so nguyen a: ");
		int a = input.nextInt();
		System.out.print("Vui long nhap so nguyen b: ");
		int b = input.nextInt();

		int sum = 0;
		int i = a;
		while (i <= b) {
			sum = sum + i;
			i++;
		}
		System.out.print(sum + " ");
	}

}
