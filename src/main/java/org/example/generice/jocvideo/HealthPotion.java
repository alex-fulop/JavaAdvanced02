package org.example.generice.jocvideo;

public class HealthPotion extends Item {
	public HealthPotion(String name) {
		super(name);
	}

	@Override
	public void useItem() {
		System.out.println("Jucatorul foloseste potiunea de viata si primeste +10HP");
	}
}
