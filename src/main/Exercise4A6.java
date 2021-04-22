package main;

import java.util.Scanner;

public class Exercise4A6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so nguyen n phan tu: ");
		int n = input.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i] % 2 != 0)
				sum = sum + arr[i];
		}
		System.out.println(sum);
	}

}
