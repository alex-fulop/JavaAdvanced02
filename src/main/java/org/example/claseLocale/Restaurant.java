package org.example.claseLocale;

public class Restaurant {

	public void gatesteMaiMultiBurgeri(String[] ingrediente, int numarDeBurgeri) {
		class Burger {
			private String garnitura;
			private int gramaj;

			public Burger(String garnitura, int gramaj) {
				this.garnitura = garnitura;
				this.gramaj = gramaj;
			}

			private void gateste() {
				System.out.println("Se adauga ingrediente:");
				for (String ingredient : ingrediente) {
					System.out.println(ingredient);
				}
			}
		}

		while (numarDeBurgeri > 0) {
			System.out.println("Se gateste burger-ul numarul " + numarDeBurgeri);
			Burger burger = new Burger("cartofi prajiti", 600);
			burger.gateste();
			numarDeBurgeri--;
		}
	}
}
