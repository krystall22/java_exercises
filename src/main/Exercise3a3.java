package main;

import java.util.Scanner;

public class Exercise3a3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Vui long nhap so nguyen n: ");
		int n = input.nextInt();
		
		for (int i = n; i >= -n; i--) {
			System.out.print(i + " ");
		}
	}

}
