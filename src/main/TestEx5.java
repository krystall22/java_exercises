package main;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {

		int[] myArr = inputArray();

		outputArray(myArr);
		findPrimeNumber(myArr);
	}

	public static int[] inputArray() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;
	}

	public static void outputArray(int[] inArr) {
		System.out.print("\nOutput elements: ");
		for (int i = 0; i < inArr.length; i++) {
			System.out.print(inArr[i] + " ");
		}
	}

	private static void findPrimeNumber(int[] myArr) {
		int count = 0;
		System.out.println("Prime Numbers: ");
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 2; j < myArr[i]; j++) {
				if (myArr[i] % j == 0) {
					count++;
				}
			}
			if (count == 0 && myArr[i] > 1) {
				System.out.println(myArr[i]);
			}
		}
	}

}
