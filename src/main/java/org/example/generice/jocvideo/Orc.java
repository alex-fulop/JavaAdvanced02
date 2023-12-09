package org.example.generice.jocvideo;

public class Orc extends Entity {
	public Orc(int healthPoints, String name) {
		super(healthPoints, name);
	}

	@Override
	public void attackPlayer() {
		System.out.println("Orcul ataca jucatorul si cauzeza 15HP DMG");
	}
}
