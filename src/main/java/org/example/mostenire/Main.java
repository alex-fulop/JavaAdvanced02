package org.example.mostenire;

public class Main {
	public static void main(String[] args) {
		Copil1 copil1 = new Copil1("brunet", "caprui");
		Copil2 copil2 = new Copil2("blond", "albastri");
		Nepot nepot = new Nepot("roscat", "verzi");

		copil1.citeste();
		copil2.citeste();

		copil1.joacaFotbal();
		copil2.joacaSah();

		nepot.joacaFotbal();

	}
}
