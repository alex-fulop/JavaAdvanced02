package org.example.abstractizare;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cerc extends FormaGeo {
	private double raza;

	public Cerc(double raza) {
		super("Cerc");
		this.raza = raza;
	}

	@Override
	public double calculeazaAria() {
		double aria = Math.PI * raza * raza;
		BigDecimal ariaRotunjita = BigDecimal.valueOf(aria);
		ariaRotunjita = ariaRotunjita.setScale(2, RoundingMode.HALF_UP);
		return ariaRotunjita.doubleValue();
	}
}
