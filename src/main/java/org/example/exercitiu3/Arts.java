package org.example.exercitiu3;

public class Arts extends Course {
	public void drawOnCanvas(int lines, int length) {
		for (int i = 0; i < lines; i++) {
			for (int y = 0; y < length; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
