package uebung11;

public class Drucker {

	private String typ;
	private String marke;
	private Patrone schwarzweissPatrone;
	private Patrone farbigePatrone;
	
	//Konstruktoren
	
	Drucker(String typ, String marke) {
		this.typ = typ;
		this.marke = marke;
	}
	
	Drucker(String typ, String marke, Patrone schwarzweissPatrone, Patrone farbigePatrone) {
		this.typ = typ;
		this.marke = marke;
		this.schwarzweissPatrone = schwarzweissPatrone;
		this.farbigePatrone = farbigePatrone;
	}
	
	// Copy-Konstruktor
	
	Drucker(Drucker drucker) {
		this.typ = drucker.typ;
		this.marke = drucker.marke;
		this.schwarzweissPatrone = new Patrone (drucker.schwarzweissPatrone);
		this.farbigePatrone = new Patrone (drucker.farbigePatrone);
	}
	
	// Getter/Setter
	
	public String getTyp() {
		return typ;
	}
	
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	public String getMarke() {
		return marke;
	}
	
	public void setMarke(String marke) {
		this.marke = marke;
	}
	
	public Patrone getSchwarzweissPatrone() {
		return schwarzweissPatrone;
	}
	
	public void setSchwarzweissPatrone(Patrone schwarzweissPatrone) {
		this.schwarzweissPatrone = schwarzweissPatrone;
	}
	
	public Patrone getFarbigePatrone() {
		return farbigePatrone;
	}
	
	public void setFarbigePatrone(Patrone farbigePatrone) {
		this.farbigePatrone = farbigePatrone;
	}
}
