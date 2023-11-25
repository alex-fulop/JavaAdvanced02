package org.example.incapsulare;

public class ContBancar {
	private final int NR_DE_LUNI = 36;
	private final float PROCENTAJ = 2.8f;
	private int balanta;

	public ContBancar(int balanta) {
		this.balanta = balanta;
	}

	public void depunere(int suma) {
		balanta += suma;
	}

	public void extragere(int suma) {
		if (suma < 0) {
			System.out.println("Suma extrasa trebuie sa fie mai mare decat 0.");
		} else {
			balanta -= suma;
		}
	}

	public void afiseazaBalanta() {
		System.out.println("Balanta dvs. este: " + balanta);
	}

	public void creditIpotecar(int valoareImobil) {
		int scor = 10;
		System.out.println("Aveti de platit " + calculeazaRata(valoareImobil, scor));
	}

	private float calculeazaRata(int valoareImobil, int scor) {
		return (float) ((valoareImobil / NR_DE_LUNI) / PROCENTAJ * scor);
	}

	public int getBalanta() {
		return balanta;
	}

	public void setBalanta(int balanta) {
		this.balanta = balanta;
	}
}
