package org.example.clase;

public class Main {
	public static void main(String[] args) {
		System.out.println("DEALERSHIP MASINI");

		// obiectul dacia de tip masina
		Masina dacia = new Masina();
		dacia.culoare = "rosu";
		dacia.kilometraj = 400000;
		dacia.viteza = 40;

		dacia.clacsoneaza();
		dacia.accelereaza(20);

		System.out.println("Dupa ce a accelerat, masina merge cu viteza " + dacia.viteza);

		Masina bmw = new Masina("negru", 210000, 90);
//		bmw.viteza = 70;

		Masina mercedes = new Masina("gri", 370000, 85);
//		mercedes.culoare = "gri";

//		System.out.println("Mercedes are culoarea " + mercedes.culoare);

		asfiseazaInformatiiMasina(dacia);
		asfiseazaInformatiiMasina(bmw);
		asfiseazaInformatiiMasina(mercedes);
	}

//	am creat o metoda pentru afisare (ctrl + alt + M)
	private static void asfiseazaInformatiiMasina(Masina masina) {
		System.out.println("Masina are culoarea " + masina.culoare);
		System.out.println("Masina are kilometrajul " + masina.kilometraj);
		System.out.println("Masina merge cu viteza " + masina.viteza);
	}
}