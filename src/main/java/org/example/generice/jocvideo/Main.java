package org.example.generice.jocvideo;

public class Main {
	public static void main(String[] args) {
		HealthPotion healthPotion = new HealthPotion("potiune de viata");
		Sword sword = new Sword("Sabie de lupta");

		Player<Item> player = new Player<>(100, "jucator1");
		player.setItem(sword);

		Orc orc = new Orc(150, "orc razboinic");
		Ghost ghost = new Ghost(60, "fantoma comuna");

		Arena<Player<Item>, Entity> arena1 = new Arena<>(player, orc);

		arena1.fight();

		player.setItem(healthPotion);

		arena1.fight();

		arena1.setFighter2(ghost);

		player.setItem(sword);

		arena1.fight();

		Item playerItem = player.dropItem();

		System.out.println("Ultimul obiect folosit: " + playerItem.getName());

	}
}
