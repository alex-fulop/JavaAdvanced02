package org.example.generice;

public class ClasaMeaCuInteger {
	private Integer element;

	public ClasaMeaCuInteger(Integer element) {
		this.element = element;
	}

	public void afiseazaElement() {
		System.out.println("Elementul este: " + element);
	}

	public Integer getElement() {
		return element;
	}

	public void setElement(Integer element) {
		this.element = element;
	}
}
