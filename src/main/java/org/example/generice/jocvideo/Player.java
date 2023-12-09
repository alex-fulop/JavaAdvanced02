package org.example.generice.jocvideo;

public class Player<PlayerItem extends Item> extends Entity {

	private PlayerItem playerItem;

	public Player(int healthPoints, String name) {
		super(healthPoints, name);
	}

	@Override
	public void attackPlayer() {
		System.out.println("Playerul se ataca singur si isi cauzeaza 10HP DMG");
	}

	public PlayerItem dropItem() {
		System.out.println("Jucatorul dezechipeaza obiectul: " + playerItem.getName());
		return playerItem;
	}

	public void useItem() {
		playerItem.useItem();
	}

	public PlayerItem getItem() {
		return playerItem;
	}

	public void setItem(PlayerItem playerItem) {
		this.playerItem = playerItem;
	}
}
