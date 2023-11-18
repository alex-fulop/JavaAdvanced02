package org.example.claseAbstracte;

public class Gaina extends Animal {
	public Gaina(int nrPicioare) {
		super(nrPicioare);
	}

	@Override
	void scoateZgomot() {
		System.out.println("Cotcodac..");
	}
}
