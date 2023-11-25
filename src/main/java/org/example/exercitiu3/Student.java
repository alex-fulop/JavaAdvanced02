package org.example.exercitiu3;

public class Student {
	private String name;
	private int age;
	private Course[] courses;

	public Student(String name, int age, Course[] courses) {
		this.name = name;
		this.age = age;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
}
