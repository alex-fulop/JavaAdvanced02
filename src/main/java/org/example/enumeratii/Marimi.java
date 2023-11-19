package org.example.enumeratii;

public enum Marimi {
	EXTRA_SMALL(32),
	SMALL(34),
	MEDIUM(36),
	LARGE(38),
	EXTRA_LARGE(40),
	EXTRA_EXTRA_LARGE(42);

	private final int numar;

	Marimi(int numar) {
		this.numar = numar;
	}

	public int getNumar() {
		return numar;
	}
}
