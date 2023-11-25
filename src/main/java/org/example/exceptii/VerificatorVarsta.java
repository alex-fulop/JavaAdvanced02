package org.example.exceptii;

public class VerificatorVarsta {
	public static void verificaVarsta(int varsta) {
		try {
			if (varsta < 18) {
				//arunca o exceptie
				throw new UnderageException("Site-ul este destinat persoanelor majore");
			}
			System.out.println("Esti adult, ai acces la site.");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Copyright 2023 site.org");
		}
	}
}
