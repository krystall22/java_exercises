package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4A8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so nguyen n phan tu: ");
		int n = input.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
