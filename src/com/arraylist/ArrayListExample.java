package com.arraylist;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list1.add("0" + i);

		}
		System.out.println(list1.toString());

		List<String> list2 = new ArrayList<>();
		list2.addAll(list1);
		list2.add("0" + 3);
		System.out.print(list2.toString());

		System.out.println(list2.indexOf("03"));
		System.out.println(list2.indexOf("06"));
		System.out.println(list2.lastIndexOf("03"));

		List<String> list4 = new ArrayList<>(list1);
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("0" + 3);
		list3.add("0" + 2);
		list4.retainAll(list3);
		System.out.println(list4.toString());
	}
}
