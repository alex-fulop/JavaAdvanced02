package org.example.generice.jocvideo;

public class Ghost extends Entity {
	public Ghost(int healthPoints, String name) {
		super(healthPoints, name);
	}

	@Override
	public void attackPlayer() {
		System.out.println("Fantoma ataca jucatorul si cauzeaza 25HP DMG");
	}
}
