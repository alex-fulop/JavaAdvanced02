package org.example.claseAbstracte;

public class Caine extends Animal {
	public Caine(int nrPicioare) {
		super(nrPicioare);
	}

	@Override
	void scoateZgomot() {
		System.out.println("Ham ham");
	}

	@Override
	void mananca() {
		System.out.println("caine mananca mai bine");
	}
}
