package org.example.exercitiu3;

public class Course {
	private String name;
	private Instructor instructor;
	private Student[] students;
	private String[] topics;
	private Grade[] grades = {};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public String[] getTopics() {
		return topics;
	}

	public void setTopics(String[] topics) {
		this.topics = topics;
	}

	public Grade[] getGrades() {
		return grades;
	}

	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Course with name='" + name + "' ";
	}
}
