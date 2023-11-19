package org.example.claseInterioare;

public class ClasaExterioara {
	private int numar = 10;

	public void doubluNumar() {
		System.out.println("Dublul numarului este " + 2 * numar);
	}

	public class ClasaInterioara {
		private int altNumar = 11;

		public void metodaInterioara() {
			System.out.println("Ne aflam in clasa interioara");
			System.out.println("Accesam metoda din clasa exterioara");
			numar = 12;
			doubluNumar();
		}

		public int getAltNumar() {
			return altNumar;
		}
	}

	public class CustomIterator {
		private int index = 0;

		public boolean hasNext() {
			return index < numar;
		}

		public int next() {
			return index++;
		}
	}
}
