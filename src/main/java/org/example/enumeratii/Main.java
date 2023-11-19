package org.example.enumeratii;

public class Main {
	public static void main(String[] args) {
		ZileleSaptamanii astazi = ZileleSaptamanii.MIERCURI;

		System.out.println("Astazi este: " + astazi);

		switch (astazi) {
			case LUNI:
				System.out.println("E luni, incepe lucru :(");
				break;
			case MIERCURI:
				System.out.println("Astazi e mijlocul saptamanii");
				break;
			case SAMBATA:
			case DUMINICA:
				System.out.println("Yey, este weekend!");
				break;
		}

		Marimi marimeaMeaLaPantaloni = Marimi.LARGE;
		System.out.println("Marimea mea la pantaloni este: " + marimeaMeaLaPantaloni);
		System.out.println("Marimea mea la pantaloni sub forma numerica: " + marimeaMeaLaPantaloni.getNumar());

	}
}
