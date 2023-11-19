package org.example.abstractizare;

import java.awt.*;

public class Main {
	public static void main(String[] args) {
		Cerc cerc = new Cerc(13.7);
		Dreptunghi dreptunghi = new Dreptunghi(7.9, 5.4);

//		am respectat abstractizarea, nu ma intereseaza cum se
//		calculeaza aria, doar vreau sa stiu cat este
		cerc.afiseazaAria();
		dreptunghi.afiseazaAria();
	}
}
