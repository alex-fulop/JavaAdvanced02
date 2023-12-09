package org.example.colectii;

public class Person implements Comparable<Person> {
	private final String name;
	private final int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " (" + age + " ani)";
	}

	@Override
	public int compareTo(Person otherPerson) {
		return Integer.compare(this.age, otherPerson.age);
	}

	public int getAge() {
		return age;
	}
}
