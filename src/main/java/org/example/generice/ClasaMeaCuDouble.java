package org.example.generice;

public class ClasaMeaCuDouble {
	private Double element;

	public ClasaMeaCuDouble(Double element) {
		this.element = element;
	}

	public void afiseazaElement() {
		System.out.println("Elementul este: " + element);
	}

	public Double getElement() {
		return element;
	}

	public void setElement(Double element) {
		this.element = element;
	}
}
