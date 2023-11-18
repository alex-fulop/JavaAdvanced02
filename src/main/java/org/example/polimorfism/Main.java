package org.example.polimorfism;

public class Main {
	public static void main(String[] args) {
		Instrument[] instrumente = new Instrument[3];

		instrumente[0] = new Chitara();
		instrumente[1] = new Pian();
		instrumente[2] = new Flaut();

		for (Instrument instrument: instrumente) {
			instrument.canta();
		}
	}
}
