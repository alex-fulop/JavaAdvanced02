package org.example.exercitiu2;

import java.time.LocalDate;

public class ToDoList {
	public static void getTasks() {
		class Task {
			private final String description;
			private final TaskPriority priority;
			private final LocalDate dueDate;

			public Task(String description, TaskPriority priority, LocalDate dueDate) {
				this.description = description;
				this.priority = priority;
				this.dueDate = dueDate;
			}

			public void checkDeadline() {
				if (dueDate.isAfter(LocalDate.now())) {
					System.out.println("There is still time to complete this task.");
				} else {
					System.out.println("Oh no! Deadline is passed.");
				}
			}

			public String getDescription() {
				return description;
			}

			public TaskPriority getPriority() {
				return priority;
			}

			public LocalDate getDueDate() {
				return dueDate;
			}
		}

		Task task1 = new Task("Finish homework", TaskPriority.HIGH, LocalDate.of(2022, 12, 1));
		Task task2 = new Task("Clean the dishes", TaskPriority.LOW, LocalDate.now().plusDays(1));
		Task task3 = new Task("Fix the printer", TaskPriority.MEDIUM, LocalDate.of(2024, 1, 15));

		Task[] tasks = {task1, task2, task3};

		System.out.println("Your tasks are:");
		for (Task task : tasks) {
			System.out.println(task.getDescription());
			System.out.println("Priority: " + task.getPriority());
			System.out.println("Deadline: " + task.getDueDate());

			task.checkDeadline();
		}
	}
}
