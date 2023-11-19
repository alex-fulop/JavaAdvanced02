package org.example.mostenire;

public class Main {
	public static void main(String[] args) {
		Copil1 copil1 = new Copil1("brunet", "caprui");
		Copil2 copil2 = new Copil2("blond", "albastri");
		Nepot nepot = new Nepot("roscat", "verzi");

		Parinte parinte = new Parinte("caprui", "blond");
		System.out.println(parinte.getCuloareOchi());
		System.out.println(parinte.getCuloarePar());

		nepot.setInaltime(180);
		System.out.println(nepot.getInaltime());

		copil1.citeste();
		copil2.citeste();

		copil1.joacaFotbal();
		copil2.joacaSah();

		nepot.joacaFotbal();

		copil1.vopsirePar("albastru");
		System.out.println("Primul copil are culoare parului: " + copil1.culoarePar);
	}
}
