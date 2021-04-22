package main;

import java.util.Scanner;

public class Exercise4A3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so nguyen n phan tu: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		int size = arr.length;
		int sum = arr[0] + arr[size - 1];
		System.out.println(sum);
	}

}
