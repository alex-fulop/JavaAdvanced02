package org.example.incapsulare;

public class Main {
	public static void main(String[] args) {
		ContBancar contCurent = new ContBancar(1000);

//		am accesat direct proprietatea clasei => am incalcat incapsularea
//		contCurent.balanta += 100;

//		reflections API
//		contCurent.balanta = 3000;

		contCurent.setBalanta(3000);
		contCurent.getBalanta();

		contCurent.depunere(100);

		contCurent.afiseazaBalanta();

		contCurent.extragere(500);

		contCurent.afiseazaBalanta();

//		contCurent.balanta -= (-200);
		contCurent.extragere(-200);

		contCurent.afiseazaBalanta();

//		banca calculeaza creditul cu un "scor" pe care clientul nu il cunoaste
		contCurent.creditIpotecar(250000);

	}
}
