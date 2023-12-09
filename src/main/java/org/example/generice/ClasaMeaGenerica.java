package org.example.generice;

// Bounded Types (Tipuri legate) => pot sa am un tip de data generic, dar limitat la o subclasa de tipuri
public class ClasaMeaGenerica<Thing extends Instrument, OtherThing> {
	private Thing element;
	private OtherThing celalaltElement;

	public ClasaMeaGenerica(Thing element, OtherThing celalaltElement) {
		this.element = element;
		this.celalaltElement = celalaltElement;
	}

	public ClasaMeaGenerica(Thing element) {
		this.element = element;
	}

	public void afiseazaElement() {
		System.out.println("Elementul este: " + element);
	}

	public void afiseazaCelalaltElement() {
		System.out.println("Celalalt element este: " + celalaltElement);
	}

	public Thing getElement() {
		return element;
	}

	public void setElement(Thing element) {
		this.element = element;
	}
}
