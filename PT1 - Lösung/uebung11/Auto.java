package uebung11;

public class Auto {

	private String kennzeichen;
	private double kilometerstand;
	private double tankvolumen;
	private double tankinhalt;
	private double verbrauch;
	private Reifen reifen;
	
	//Konstruktoren
	
	Auto(String kennzeichen, double kilometerstand, double tankvolumen, double tankinhalt, double verbrauch, Reifen reifen) {
		
		this.kennzeichen = kennzeichen;
		this.kilometerstand = kilometerstand;
		this.tankvolumen = tankvolumen;
		this.tankinhalt = tankinhalt;
		this.verbrauch = verbrauch;
		this.reifen = reifen;
	}
	
	Auto(double tankvolumen, double verbrauch, Reifen reifen) {
		this.tankvolumen = tankvolumen;
		this.verbrauch = verbrauch;
		this.reifen = reifen;
	}
	
	// Copy-Konstruktor
	
	Auto(Auto auto){
		
		this.kennzeichen = auto.kennzeichen;
		this.kilometerstand = auto.kilometerstand;
		this.tankvolumen = auto.tankvolumen;
		this.tankinhalt = auto.tankinhalt;
		this.verbrauch = auto.verbrauch;
		this.reifen = new Reifen(auto.reifen);
	}
	
	public void fahren(double strecke) {
		
		System.out.println("Brumm...");
		
		if ((strecke * (verbrauch/100)) > tankinhalt) {	
			strecke = tankinhalt / (verbrauch/100);
		}
		tankinhalt -= strecke * (verbrauch/100);
		this.kilometerstand += strecke;
		
		System.out.println(strecke + " km gefahren! Der Kilometerstand steht nun bei " + kilometerstand + " km. Tankinhalt beträgt jetzt " + tankinhalt + " Liter.");
	}
	
	public void tanken(double treibstoff) {
		
		if ((treibstoff + tankinhalt) > tankvolumen) {
			treibstoff = tankvolumen - tankinhalt;
		}
		
		tankinhalt += treibstoff;
		
		System.out.println(treibstoff + " Liter getankt. Tankinhalt beträgt jetzt " + tankinhalt + " Liter.");
		
	}
}
