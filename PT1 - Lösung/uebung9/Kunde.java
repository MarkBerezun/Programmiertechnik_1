package uebung9;

public class Kunde {
	
	private String name;
	private int alter;
	private Kunde vorherigerKunde;
	private int kundenNummer;
	private static int folgeNummer = 1;
	
	// Konstruktoren:
	
	private Kunde() {
		this.kundenNummer = folgeNummer;
		folgeNummer++;
	}
	
	public Kunde(String name) {
		this();
		this.name = name;
	}
	
	public Kunde(String name, int alter) {
		this();
		this.name = name;
		this.alter = alter;
	}
	
	public Kunde(String name, int alter, Kunde vorherigerKunde) {
		this();
		this.name = name;
		this.alter = alter;
		this.vorherigerKunde = vorherigerKunde;
	}
	
	// Getter/Setter:
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public int getAlter() {
		
		return alter;
	}
	
	public void setAlter(int alter) {
		
		this.alter = alter;
	}
	
	public String getVorherigerKunde() {
		
		return "Vorheriger Kunde: \n" + "Name: " + vorherigerKunde.name + "\nAlter: " + vorherigerKunde.alter + "\nKundennummer: " + vorherigerKunde.kundenNummer;
	}
	
	public int getKundenNummer() {
		
		return kundenNummer;
	}
	
	public int getFolgeNummer() {
		
		return folgeNummer;
	}
	
	public boolean istErster() {
		
		if (vorherigerKunde == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printKunde() {
		
		System.out.println("Name: " + name + ", " + "Alter: " + alter + ", " + "Kundennummer: " + kundenNummer);
	}
	
	public String toString() {					// dies ist die von "Object" überschriebene toString()-Methode. Sie wird jedesmal aufgerufen, wenn ein Objekt als String übergeben wird, daher wird sie bei Aufruf von "vorherigerKunde" in Zeile 91 erneut für das jeweilige Kunde-Objekt aufgerufen!
		
		String ausgabe = name + " " + kundenNummer + "";
		if (vorherigerKunde != null) {
			ausgabe = ausgabe + " kommt nach " + vorherigerKunde;
		}
		return ausgabe;
	}
	
	public static void main(String[] args) {
		
		Kunde kunde1 = new Kunde("Anton", 54);
		Kunde kunde2 = new Kunde("Berta", 32, kunde1);
		Kunde kunde3 = new Kunde("Cäsar", 19, kunde2);
		
		System.out.println(kunde1.toString());
		System.out.println(kunde2.toString());
		System.out.println(kunde3.toString());
		
	}
}
