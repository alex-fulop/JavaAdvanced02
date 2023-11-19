package org.example.abstractizare;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dreptunghi extends FormaGeo {
	private double lungime;
	private double latime;

	public Dreptunghi(double lungime, double latime) {
		super("Dreptunghi");
		this.lungime = lungime;
		this.latime = latime;
	}

	@Override
	public double calculeazaAria() {
		double aria = lungime * latime;
		BigDecimal ariaRotunjita = BigDecimal.valueOf(aria);
		ariaRotunjita = ariaRotunjita.setScale(2, RoundingMode.HALF_UP);
		return ariaRotunjita.doubleValue();
	}
}
