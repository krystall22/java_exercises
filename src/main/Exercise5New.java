package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5New {
	public static void main(String[] args) {
		//
		int[] myArr = inputArray();

		outputArray(myArr);
		int a = findMax(myArr);
		System.out.printf("\nMax: " + a);

		int b = findMin(myArr);
		System.out.println("\nMin: " + b);

		findPrimeNumber(myArr);

		int[] newArray = insertK(myArr);
		int[] secondArr = removeK(newArray);
		int[] thirdArr = moveZeroToTheLast(secondArr);
		outputArray(thirdArr);
		sortArray(thirdArr);

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

	public static int findMax(int[] myArr) {
		int max = myArr[0];
		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] > max)
				max = myArr[i];
		}
		return max;
	}

	public static int findMin(int[] myArr) {
		int min = myArr[0];
		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] < min)
				min = myArr[i];
		}
		return min;
	}

	public static boolean isPrimeNumber(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void findPrimeNumber(int[] myArr) {
		System.out.print("Prime Number: ");
		for (int i = 0; i < myArr.length; i++) {
			if (isPrimeNumber(myArr[i]) == true) {
				System.out.print(myArr[i] + " ");
			}
		}
	}

	public static int inputK() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter k: ");
		int k = in.nextInt();

		return k;
	}

	public static int[] insertK(int[] myArr) {
		int[] newArr = new int[myArr.length + 1];
		int index = inputK();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = in.nextInt();
		System.out.println("New Array after inserting value " + x + " at the index " + index + " : ");
		for (int i = 0; i < newArr.length; i++) {
			if (i < index) {
				newArr[i] = myArr[i];
			} else if (i == index) {
				newArr[i] = x;
			} else {
				newArr[i] = myArr[i - 1];
			}
			System.out.print(newArr[i] + " ");
		}

		return newArr;
	}

	public static int[] removeK(int[] myArr) {
		int[] newArr = new int[myArr.length - 1];
		int index = inputK();
		System.out.println("New Array after removing value at the index " + index + " : ");
		for (int i = 0; i < newArr.length; i++) {
			if (i < index) {
				newArr[i] = myArr[i];
			} else {
				newArr[i] = myArr[i + 1];
			}
			System.out.print(newArr[i] + " ");
		}
		return newArr;
	}

	public static int[] moveZeroToTheLast(int[] myArr) {
		int count = 0;
		System.out.print("\nNew Array after changing the position: ");
		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] != 0) {
				myArr[count] = myArr[i];
				count++;
			}
		}
		for (int i = count; i < myArr.length; i++) {
			myArr[i] = 0;
		}
		return myArr;
	}

	public static int[] sortArray(int[] myArr) {
		Arrays.sort(myArr);
		System.out.println("\nArray after sorting: ");
		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + " ");
		}
		return myArr;
	}
}
