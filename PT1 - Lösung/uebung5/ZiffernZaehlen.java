package uebung5;

public class ZiffernZaehlen {

	static int ziffern = 0;						
	
	public static void main(String[] args) {
		ziffernZaehlen(9432190);
	}
	
	public static void ziffernZaehlen (int zahl) {
		
		if (zahl != 0) {							// Abbruchbedingung, bzw. Bedingung zum Weiterlaufen
			zahl /= 10;								// verkleinere Zahl um eine Stelle	
			ziffern++;								// ziffern wird inkrementiert
			ziffernZaehlen(zahl);					// Rekursion
		}
		else System.out.println(ziffern);			// gib "ziffern" in Konsole aus. Ende der Rekursion.
	}
}