package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample01 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>(3);
		for (int i = 1; i <= 5; i++) {
			Student student = new Student(i, "myname" + i);
			students.add(student);
		}
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
