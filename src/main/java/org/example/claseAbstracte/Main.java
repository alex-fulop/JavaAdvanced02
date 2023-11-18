package org.example.claseAbstracte;

public class Main {
	public static void main(String[] args) {
		Caine caine = new Caine(4);
		Pisica pisica = new Pisica(4);
		Gaina gaina = new Gaina(2);

		caine.scoateZgomot();
		pisica.scoateZgomot();
		gaina.scoateZgomot();

		caine.mananca();
		pisica.mananca();
		gaina.mananca();

		System.out.println("Nr picioare caine: " + caine.nrPicioare);
		System.out.println("Nr picioare pisica: " + pisica.nrPicioare);
		System.out.println("Nr picioare gaina: " + gaina.nrPicioare);

	}
}
