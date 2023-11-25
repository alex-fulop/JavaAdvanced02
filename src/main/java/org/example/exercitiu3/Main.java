package org.example.exercitiu3;

import java.util.Arrays;

public class Main {
	//	ex3. Online Learning Platform Build an online learning platform with classes
//	for Course, Instructor, Student, and Enrollment. Implement methods for
//	course enrollment, grading, and generating student transcripts.
	public static void main(String[] args) {
		Math math = new Math();
		Biology biology = new Biology();
		Arts arts = new Arts();

		Student student1 = new Student("Daniel", 22, new Course[]{math, biology});
		Student student2 = new Student("Mihai", 24, new Course[]{math, arts});
		Student student3 = new Student("Bogdan", 21, new Course[]{arts, biology});

		Grade grade1 = new Grade(student1, math, 7.5f);
		Grade grade2 = new Grade(student1, math, 9f);
		Grade grade3 = new Grade(student2, math, 4f);

		math.setName("Mathematics");
		math.setStudents(new Student[]{student1, student2});
		math.setGrades(new Grade[]{grade1, grade2, grade3});
		math.setTopics(new String[]{"Algebra", "Trigonometry", "Calculus"});

		biology.setName("Biology");
		arts.setName("Arts");

		Transcript transcript = new Transcript();

		Instructor instructor = new Instructor("mr. prof.", 40, math, transcript);

		for (Student student : math.getStudents()) {
			instructor.getTranscript().getGrades(student);
		}

		System.out.println("Sum: " + math.calculateSum(3, 4));
		System.out.println(Arrays.toString(biology.getMuscleGroups()));
		arts.drawOnCanvas(5, 10);

	}
}
