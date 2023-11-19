package org.example.mostenire;

public class Copil2 extends Parinte{
	public Copil2(String culoarePar, String culoareOchi) {
		super(culoarePar, culoareOchi);
//		this.culoareOchi = culoareOchi;
//		this.culoarePar = culoarePar;
	}

	@Override
	void citeste() {
		System.out.println("Cel de-al doilea copil citeste");
	}

	void joacaSah() {
		System.out.println("Se joaca sah...");
	}
}
