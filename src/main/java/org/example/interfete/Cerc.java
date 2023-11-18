package org.example.interfete;

public class Cerc implements FormaGeo, FiguraGeo {
	public int raza;

	public Cerc(int raza) {
		this.raza = raza;
	}

	//a rescrie o metoda din supertype in subtype => method overriding
	@Override
	public int calculArie() {
		return (int)(Math.PI * raza * raza);
	}

	@Override
	public int calculPerimetru() {
		return (int) (2 * Math.PI * raza);
	}

	@Override
	public void rotestete() {

	}
}
