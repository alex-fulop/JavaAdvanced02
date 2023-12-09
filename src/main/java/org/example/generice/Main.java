package org.example.generice;

public class Main {
	public static void main(String[] args) {
		String[] stringArray = {"Girafa", "Elefant", "Tigru"};
		Integer[] intsArray = {1, 3, 5, 7, 9, 11};
		Character[] charsArray = {'H', 'e', 'l', 'l', 'o'};
		Double[] doublesArray = {1.7, 3.3, 8.9, 4.2};

		afiseazaArray(stringArray);
		afiseazaArray(intsArray);
		afiseazaArray(charsArray);
		afiseazaArray(doublesArray);

		ClasaMeaCuInteger clasaMeaCuInteger = new ClasaMeaCuInteger(10);
		clasaMeaCuInteger.afiseazaElement();

		ClasaMeaCuDouble clasaMeaCuDouble = new ClasaMeaCuDouble(10.10);
		clasaMeaCuDouble.afiseazaElement();

		ClasaMeaGenerica<Toba, Integer> clasaMeaGenerica1 = new ClasaMeaGenerica<>(new Toba(), 100);
		ClasaMeaGenerica<Flaut, String> clasaMeaGenerica2 = new ClasaMeaGenerica<>(new Flaut(), "dinamita");
		ClasaMeaGenerica<Chitara, Character> clasaMeaGenerica3 = new ClasaMeaGenerica<>(new Chitara(), 'X');

		clasaMeaGenerica1.afiseazaElement();
		clasaMeaGenerica1.afiseazaCelalaltElement();
		clasaMeaGenerica2.afiseazaElement();
		clasaMeaGenerica2.afiseazaCelalaltElement();
		clasaMeaGenerica3.afiseazaElement();
		clasaMeaGenerica3.afiseazaCelalaltElement();
	}

	public static <Thing> void afiseazaArray(Thing[] array) {
		for (Thing element : array) {
			System.out.print(element + ", ");
		}
		System.out.println();
	}
}
