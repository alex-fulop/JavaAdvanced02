package org.example.generice.jocvideo;

public abstract class Item {
	public String name;

	public Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void useItem();
}
