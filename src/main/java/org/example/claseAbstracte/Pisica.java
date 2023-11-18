package org.example.claseAbstracte;

public class Pisica extends Animal{
	public Pisica(int nrPicioare) {
		super(nrPicioare);
	}

	@Override
	void scoateZgomot() {
		System.out.println("Miau miau..");
	}
}
