package org.example.clase;

public class Masina {
	//daca nu specificam nici un access modifier => package protected
	public String culoare;
	public int kilometraj;
	public int viteza;

	//constructori
	public Masina() {
		System.out.println("Dealershipul primeste o masina noua!");
	}

	//crearea mai multor metode cu acelasi nume, dar cu parametrii diferiti => method overloading
	public Masina(String culoare, int kilometraj, int viteza) {
		this.culoare = culoare;
		this.viteza = viteza;
		this.kilometraj = kilometraj;
	}

	public void clacsoneaza() {
		System.out.println("BEEEP...");
	}

	public void accelereaza(int viteza) {
		this.viteza += viteza;
	}
}
