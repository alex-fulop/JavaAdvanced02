package org.example.mostenire;

public class Nepot extends Copil1 {
	private int inaltime;

	public Nepot(String culoarePar, String culoareOchi) {
		super(culoarePar, culoareOchi);
	}

	//getter si settere
	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}
}
