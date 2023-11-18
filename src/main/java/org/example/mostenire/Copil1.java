package org.example.mostenire;

public class Copil1 extends Parinte {
	public Copil1(String culoarePar, String culoareOchi) {
		this.culoareOchi = culoareOchi;
		this.culoarePar = culoarePar;
	}

	@Override
	void citeste() {
		System.out.println("Primul copil citeste");
	}

	void joacaFotbal() {
		System.out.println("Se joaca fotbal..");
	}
}
