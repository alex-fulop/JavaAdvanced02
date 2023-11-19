package org.example.mostenire;

public class Parinte {
	protected String culoareOchi;
	protected String culoarePar;

	public Parinte(String culoareOchi, String culoarePar) {
		this.culoareOchi = culoareOchi;
		this.culoarePar = culoarePar;
	}

	void citeste() {
		System.out.println("Parintele citeste..");
	}

	public String getCuloareOchi() {
		return culoareOchi;
	}

	public String getCuloarePar() {
		return culoarePar;
	}
}
