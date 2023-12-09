package org.example.generice.jocvideo;

public abstract class Entity {
	private int healthPoints;
	private String name;

	public Entity(int healthPoints, String name) {
		this.healthPoints = healthPoints;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public abstract void attackPlayer();
}
