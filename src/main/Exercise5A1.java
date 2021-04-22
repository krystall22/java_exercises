package main;

import java.util.Scanner;

public class Exercise5A1 {

	public static void main(String[] args) {
		int[] myArr = inputArray();
		outputArray(myArr);
		int a = findMax(myArr);
		System.out.printf("\nMax: " + a);
		int b = findMin(myArr);
		System.out.println("\nMin: " + b);
	}

	private static int[] inputArray() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the element of the array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;
	}

	private static void outputArray(int[] myArrpp) {
		System.out.print("The element of the array: ");
		for (int i = 0; i < myArrpp.length; i++) {
			System.out.print((myArrpp[i] + " "));
		}
	}

	private static int findMax(int[] myArr) {
		int max = myArr[0];
		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] > max)
				max = myArr[i];
		}
		return max;
	}

	private static int findMin(int[] myArr) {
		int min = myArr[0];
		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] < min)
				min = myArr[i];
		}
		return min;
	}
	
	/*private static int findPrimeNumber (int[] myArr) {
		int i = 0;
		if (myArr[i] <= 1)
			return false;
			*/
		
	
}
