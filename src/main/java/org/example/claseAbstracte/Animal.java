package org.example.claseAbstracte;

public abstract class Animal {
	int nrPicioare;

	public Animal(int nrPicioare) {
		this.nrPicioare = nrPicioare;
	}

	abstract void scoateZgomot();

	void mananca() {
		System.out.println("Animalul mananca...");
	}
}
