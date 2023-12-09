package org.example.colectii;

import java.util.*;

public class Main {
	public static void main(String[] args) {
//		Liste.exempluArrayList();
//		Liste.exempluStack("Hello, World!");
//		Colectii.exempluQueue();
//		Colectii.exempluDeque();
//		Colectii.exempluSet();
//		Colectii.exempluMap();

//		List<Person> persons = new ArrayList<>();
//
//		persons.add(new Person("David", 23));
//		persons.add(new Person("Sergiu", 22));
//		persons.add(new Person("Andreea", 17));
//		persons.add(new Person("Gabriel", 26));
//
//		persons.sort(new PersonAgeComparator());
//
//		for (Person person: persons) {
//			System.out.println(person);
//		}

//		Arrays.asList(new Integer[]{1, 3, 4})'

		ArrayList<Integer> numb = new ArrayList<Integer>();

		numb.add(2);

		Iterator<Integer> iterator = numb.iterator();
		while (iterator.hasNext()) {
			Integer num = iterator.next();
			iterator.remove(); // Safely remove the current element
		}
	}
}
