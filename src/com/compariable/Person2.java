package com.compariable;

import java.util.Comparator;

public class Person2 implements Comparator<Person2> {
	private int id;
	private String name;

	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compare(Person2 o1, Person2 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
