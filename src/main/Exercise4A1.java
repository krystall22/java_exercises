package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4A1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap 10 so nguyen: ");
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println(Arrays.toString((arr)).substring(1).replaceFirst("]", "").replace(", ", " "));

	}
}
