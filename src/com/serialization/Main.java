package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// Write-out-serialized
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("data/student.txt");
			oos = new ObjectOutputStream(fos);
			Student student = new Student();
			student.setName("Tom");
			student.setAge(10);
			oos.writeObject(student);
			oos.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
