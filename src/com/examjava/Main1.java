package com.examjava;

public class Main1 {

	public static void main(String[] args) {
		String name1 = "51-U1-224.35";
		int b = name1.length();
		System.out.println(b);
		System.out.println(name1.substring(0, 1));
		System.out.println(name1.subSequence(0, 2));
		if (b == 12 & name1.substring(0, 1) == "5") {
			System.out.println(name1);
		} else {
			System.out.println("Wrong input");

		}

	}
}
