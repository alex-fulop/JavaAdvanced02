package org.example.exercitiu3;

public class Transcript {
	public void getGrades(Student student) {
		for (Course course : student.getCourses()) {
			System.out.println(student.getName() + "'s grades for " + course + "are: ");

			if (course.getGrades().length == 0) {
				System.out.println(student.getName() + " doesn't have any grades for " + course);
			} else {
				for (Grade grade : course.getGrades()) {
					if (grade.getStudent() == student) {
						System.out.println(grade.getGrade());
					}
				}
			}
		}

	}
}
