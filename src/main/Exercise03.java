package main;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the first number: ");
		int n1 = input.nextInt();
		System.out.println("Please input the second number: ");
		int n2 = input.nextInt();
		
		int sum = n1 + n2;
		int subtract = n1 - n2;
		int multiply = n1 * n2;
		int divide = n1 / n2;
		int remainderOf2Numbers = n1 % n2;
		
		System.out.println();
		System.out.println("Sum = " + sum);
		System.out.println("Subtract = " + subtract);
		System.out.println("Multiply = " + multiply);
		System.out.println("Divide = " + divide);
		System.out.println("Remainder of 2 numbers = " + remainderOf2Numbers);
		
	}

}
