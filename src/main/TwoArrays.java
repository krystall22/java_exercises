package main;

import java.util.Arrays;

public class TwoArrays {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 11, 12 }, { 11, 22, 33 } };
		/*
		 * System.out.println("Cach 1"); for (int i = 0; i < arr.length; i++) {
		 * System.out.println(); for (int j = 0; j < arr[i].length; j++) {
		 * System.out.print(arr[i][j] + " "); } }
		 */

		System.out.println("Cach 2");
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			System.out.print(Arrays.toString(arr[i]));
		}
	}

}
