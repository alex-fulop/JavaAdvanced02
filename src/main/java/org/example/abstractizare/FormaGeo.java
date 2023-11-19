package org.example.abstractizare;

public abstract class FormaGeo {
	protected String nume;

	public FormaGeo(String nume) {
		this.nume = nume;
	}

	protected abstract double calculeazaAria();

	void afiseazaAria() {
		System.out.println("Acesta este un " + nume + " si are aria " + calculeazaAria());
	}
}
