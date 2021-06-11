package kurse;

public class Kurs {

	protected String name;
	protected String dozent;
	protected boolean sale = false;
	
	public Kurs(String name, String dozent, boolean sale) {
		this.name = name;
		this.dozent = dozent;
		this.sale = sale;
	}
	
	// Copy-Konstruktor
	public Kurs(Kurs copyKurs) {
		this.name = copyKurs.name;
		this.dozent = copyKurs.dozent;
		this.sale = copyKurs.sale;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isSale() {
		return sale;
	}
	
	public void buchen() {
		// Code zum Kurs buchen 
		System.out.println("Sie haben Ihren Kurs " + this.name + " " + "erfolgreich gebucht.");
	}
	
	public void infosZeigen() {
		System.out.println("Kurs: " + this.name + ", " + this.dozent);
	}
}
