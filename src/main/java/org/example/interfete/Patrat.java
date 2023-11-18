package org.example.interfete;

public class Patrat implements FormaGeo{
	public int latura;

	public Patrat(int latura) {
		this.latura = latura;
	}

	@Override
	public int calculArie() {
		return latura * latura;
	}

	@Override
	public int calculPerimetru() {
		return latura * 4;
	}
}
