package main;

public class Test2Arrays {

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, -2 }, { 2, 3 }, { 2, 4, 5 } };
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}

}
