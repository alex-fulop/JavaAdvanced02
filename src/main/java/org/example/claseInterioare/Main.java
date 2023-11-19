package org.example.claseInterioare;

public class Main {
	public static void main(String[] args) {
		//am creat o instanta a clasei exterioare
		ClasaExterioara clasaExterioara = new ClasaExterioara();

		//cream o instanta a clasei interioare
		ClasaExterioara.ClasaInterioara clasaInterioara = clasaExterioara.new ClasaInterioara();

		clasaExterioara.doubluNumar();
		clasaInterioara.metodaInterioara();
		System.out.println(clasaInterioara.getAltNumar());

		ClasaExterioara.CustomIterator iterator = clasaExterioara.new CustomIterator();

		while (iterator.hasNext()) {
			System.out.println("Ma duc cu iteratorul de 10 ori");
			iterator.next();
		}
	}
}
