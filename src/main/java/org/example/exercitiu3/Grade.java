package org.example.exercitiu3;

public class Grade {
	private final Student student;
	private final Course course;
	private final float grade;

	public Grade(Student student, Course course, float grade) {
		this.student = student;
		this.course = course;
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	public float getGrade() {
		return grade;
	}
}
