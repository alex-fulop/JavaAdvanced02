package org.example.interfete;

public class Dreptunghi implements FormaGeo {

	public int lungime;
	public int latime;

	public Dreptunghi(int lungime, int latime) {
		this.lungime = lungime;
		this.latime = latime;
	}

	@Override
	public int calculArie() {
		return lungime * latime;
	}

	@Override
	public int calculPerimetru() {
		return 2 * latime + 2 * lungime;
	}
}
