package com.main;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Person person = new Person("Bob", 10);
		System.out.println(person.name);
		System.out.println(person.age);
	}

}
