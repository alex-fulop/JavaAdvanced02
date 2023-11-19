package org.example.mostenire;

public class Copil1 extends Parinte {
	public Copil1(String culoarePar, String culoareOchi) {
		super(culoarePar, culoareOchi);
//		this.culoareOchi = culoareOchi;
//		this.culoarePar = culoarePar;
	}

	public void vopsirePar(String culoare) {
		this.culoarePar = culoare;
	}

	@Override
	void citeste() {
		System.out.println("Primul copil citeste");
	}

	void joacaFotbal() {
		System.out.println("Se joaca fotbal..");
	}
}
