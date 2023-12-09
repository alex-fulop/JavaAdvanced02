package org.example.generice.jocvideo;

public class Arena<Fighter1, Fighter2 extends Entity> {
	private Fighter1 fighter1;
	private Fighter2 fighter2;

	public Arena(Fighter1 fighter1, Fighter2 fighter2) {
		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
	}

	public Fighter1 getFighter1() {
		return fighter1;
	}

	public Fighter2 getFighter2() {
		return fighter2;
	}

	public void setFighter2(Fighter2 fighter2) {
		this.fighter2 = fighter2;
	}

	public void fight() {
		System.out.println("Jucatorul se lupta cu: " + fighter2.getName());
		((Player<Item>) fighter1).useItem();
		fighter2.attackPlayer();
	}
}
