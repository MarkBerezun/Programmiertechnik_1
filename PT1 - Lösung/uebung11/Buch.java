package uebung11;

public class Buch {
	
	private String titel;
	private long isbn;
	private double preis;
	private Verlag verlag;
	
	// Konstruktoren
	
	Buch(String titel, long isbn, double preis) {
		
		this.titel = titel;
		this.isbn = isbn;
		this.preis = preis;
	}
	
	Buch(String titel, long isbn, double preis, Verlag verlag) {
		
		this.titel = titel;
		this.isbn = isbn;
		this.preis = preis;
		this.verlag = verlag;
	}
	
	// Copy-Konstruktor
	
	Buch(Buch buch) {
		
		this.titel = buch.titel;
		this.isbn = buch.isbn;
		this.preis = buch.preis;
		//this.verlag = new Verlag(buch.verlag.getName());	// Diese Lösung ist etwas anders als die in der Übung vorgegebene Lösung, da aber nur ein Konstruktor-Parameter benötigt wird (name), geht das auch. Hierfür ist kein spezieller Copy-Konstruktor in Verlag nötig.
		this.verlag = new Verlag(buch.verlag); 				// Für eine tiefe Kopie muss ein neues Verlag-Objekt erzeugt werden, dass über den Copy-Konstruktor von Verlag erzeugt wird.
	}
	
	// Getter/Setter
	public String getTitel() {
		return titel;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public long getIsbn() {
		return isbn;
	}
	
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	public double getPreis() {
		return preis;
	}
	
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public void setVerlag(Verlag verlag) {
		this.verlag = verlag;
	}
	
	public Verlag getVerlag() {
		return verlag;
	}
	
}
