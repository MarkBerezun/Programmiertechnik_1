package uebung9;

public class Boot {
	
	private float groesse;				// Länge des Boots in cm
	private String name;
	private int liegeplatznummer;
	
	Boot (float groesse, String name) {
		
		this.groesse = groesse;
		this.name = name;
		
	}
	
	// Getter/Setter
	
	public float getGroesse() {
		
		return groesse;
	}
	
	public void setGroesse(float groesse) {
		
		this.groesse = groesse;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
	
		this.name = name;
	}
	
	public int getLiegeplatznummer() {
		
		return liegeplatznummer;
	}
	
	public void setLiegeplatznummer(int liegeplatznummer) {
		
		this.liegeplatznummer = liegeplatznummer;
	}
	
	public String toString() {
		
		return "Name: " + name + " | " + "Größe: " + groesse + " cm" + " | Liegeplatznummer: " + liegeplatznummer;
	}
}
