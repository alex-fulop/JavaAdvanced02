package org.example.generice.jocvideo;

public class Sword extends Item {

	public Sword(String name) {
		super(name);
	}

	@Override
	public void useItem() {
		System.out.println("Jucatorul ataca inamicul cu " + name + " si cauzeaza 10 DMG");
	}
}
