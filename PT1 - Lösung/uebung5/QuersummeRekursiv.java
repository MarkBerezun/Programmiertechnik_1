package uebung5;

public class QuersummeRekursiv {

	static int quersumme = 0;				// muss static sein, damit darauf zugegriffen werden kann
	
	public static void quersummeRekursiv (int zahl) {
		
		if (zahl < 0) {
			System.out.println("Zahl ist negativ!");
			zahl *= -1;
//			return;
		}
		
		if (zahl == 0) {					// ist "zahl" == 0, gib "quersumme" in die Konsole aus (Abbruchbedingung) 
			System.out.println(quersumme);
		}
		else {
			quersumme += (zahl % 10);		// addiere die letzte Ziffer von "zahl" (zahl mod 10) zu "quersumme"
			zahl /= 10;						// damit "zahl" kleiner wird und wir rekursiv arbeiten können, dividiere durch 10. Dadurch wird die vorletzte Stelle zur letzten Stelle von "zahl" 
			//System.out.println(zahl);
			quersummeRekursiv(zahl);		// Rekursion
		}
	}
	
	public static void main(String[] args) {
		
		quersummeRekursiv(36);
		
	}
}
