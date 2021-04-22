package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4A5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so nguyen n phan tu: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("Nhap so k: ");
		int k = input.nextInt();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k)
				count = count + 1;
		}
		System.out.println(count);
	}

}
