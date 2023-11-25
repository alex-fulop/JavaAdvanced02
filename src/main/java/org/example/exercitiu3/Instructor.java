package org.example.exercitiu3;

public class Instructor {
	private String name;
	private int age;
	private Course course;
	private Transcript transcript;

	public Instructor(String name, int age, Course course, Transcript transcript) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.transcript = transcript;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
}
