package uebung11;

public class Reifen {

	private String typ;
	private String marke;
	
	//Konstruktoren

	Reifen(String typ) {
		this.typ = typ;
	}
	
	Reifen(String typ, String marke) {
		this.typ = typ;
		this.marke = marke;
	}
	
	// Copy-Konstruktor 
	
	Reifen (Reifen reifen) {
		this.typ = reifen.typ;
		this.marke = reifen.marke;
	}
}
