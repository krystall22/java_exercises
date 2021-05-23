package com.compariable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person2> listPerson = new ArrayList<Person2>();
		listPerson.add(new Person2(1, "aa"));
		listPerson.add(new Person2(2, "zz"));
		listPerson.add(new Person2(3, "aa"));
		listPerson.add(new Person2(2, "ee"));

		// Collections.sort(listPerson);
		//Collections.sort(listPerson, new Comparator<Person2>);
		for (Person2 person : listPerson) {
			System.out.println(person.toString());
		}
	}

}
