package main;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input your grade: ");
		int grade = input.nextInt();
		
		if (grade < 50) {
			System.out.println("Learn again");
		}
		else if (grade < 60) {
			System.out.println("Grade D");
		}
		else if (grade < 75) {
			System.out.println("Grade C");
		}
		else if (grade < 85) {
			System.out.println("Grade B");
		}
		else {
			System.out.println("Grade A");
		}
	}

}
