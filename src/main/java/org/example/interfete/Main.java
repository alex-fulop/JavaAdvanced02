package org.example.interfete;

public class Main {
	public static void main(String[] args) {
		Cerc cerc = new Cerc(10);
		Patrat patrat = new Patrat(4);
		Dreptunghi dreptunghi = new Dreptunghi(2, 6);
//		FormaGeo formaGeo = new FormaGeo();

		System.out.println("Perimetru Cerc " + cerc.calculPerimetru());
		System.out.println("Arie Cerc " + cerc.calculArie());

		System.out.println("Perimetru Patrat " + patrat.calculPerimetru());
		System.out.println("Arie Patrat " + patrat.calculArie());

		System.out.println("Perimetru Dreptunghi " + dreptunghi.calculPerimetru());
		System.out.println("Arie Dreptunghi " + dreptunghi.calculArie());
	}
}
