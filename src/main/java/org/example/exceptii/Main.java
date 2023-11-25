package org.example.exceptii;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			//exceptie unchecked
			int variable = Integer.parseInt("copac");
			System.out.println("Variabila: " + variable);
		} catch (NumberFormatException nfe) {
			System.out.println("Sirul de caractere nu a putut fi convertit in numar...");
			System.out.println(nfe.getMessage());
		}

		//exceptie unchecked
//		int newVariable = 10 / 0;

		try {
			//exceptie checked
			FileReader fileReader = new FileReader("fisier.txt");
			System.out.println((char) fileReader.read());
			//exceptie checked
			Thread.sleep(2000);
		} catch (FileNotFoundException | InterruptedException ex) {
			System.out.println("fisierul nu a fost gasit " + ex.getMessage());
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			System.out.println("S-a incercat citirea fisierului");
		}
//		catch (InterruptedException e) {
//			System.out.println("Thread-ul a fost intrerupt");
//		}

		VerificatorVarsta.verificaVarsta(24);
		VerificatorVarsta.verificaVarsta(16);

		try {
			imparte(5, 6);
			imparte(10, 3);
			imparte(7, 0);
			imparte(7, 0);
		} catch (ArithmeticException | InterruptedException ae) {
			System.out.println(ae.getMessage());
		}

//		File file = new File("fisier.txt");
//		if(file.exists()) {
//			System.out.println("fisierul exista");
//		} else {
//			System.out.println("nu exista");
//		}
//		throw new RuntimeException("Codul nu mai merge");

	}

	private static void imparte(int deImpartit, int impartitor) throws ArithmeticException, InterruptedException {
		Thread.sleep(3000);
		int rezultat = deImpartit / impartitor;
		System.out.println(rezultat);
	}
}
