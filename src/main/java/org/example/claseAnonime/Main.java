package org.example.claseAnonime;

public class Main {
	public static void main(String[] args) {
		Salut salutInRomana = new Salut() {
			@Override
			public void salutaLumea() {
				System.out.println("Ceau!");
			}
		};

		Salut salutInEngleza = new Salut() {
			@Override
			public void salutaLumea() {
				System.out.println("Hello!");
			}
		};

		Salut salutInFranceza = new Salut() {
			@Override
			public void salutaLumea() {
				System.out.println("Bonjour!");
			}
		};

		salutInRomana.salutaLumea();
		salutInEngleza.salutaLumea();
		salutInFranceza.salutaLumea();

		//Un tread = un fir de executie al programului
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("Thread-ul nou ruleaza acum!");
			}
		};

		thread.run();
	}
}
