package uebung4;

public class Tannenbaum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tannenbaum(7);

	}
	
	public static void tannenbaum(int size) {
		
		int marginLeft = size - 1;						// linker Abstand: Endgröße des Tannenbaums - 1
		int stars = 1;									// speichert die Anzahl der zu generierenden Sterne für das "Laub" des Tannenbaums. Die Spitze besteht aus einem Stern.
		
		for(int i = 0; i < size; i++) {					// iteriert durch jede Konsolenzeile
			
			for(int j = 0; j <= marginLeft; j++) {		// schreibt den linken Abstand als Leerzeichen 
				System.out.print(" ");
			}
			marginLeft--;								// nach jeder Zeile schrumpft der Abstand zum linken Rand um 1
			
			for (int starsToDraw = stars; starsToDraw > 0; starsToDraw--) {		// "zeichne" soviele Sterne (starsToDraw) wie für diese Zeile benötigt werden (stars)
			System.out.print("*");
			}
			stars += 2;									// mit jeder Konsolenzeile steigt die Anzahl der Sterne um 2
			System.out.println();						// Zeilensprung für nächste Ebene des Tannenbaums
		}
		
		marginLeft = size - 1;							// ab hier wird der "Stamm" des Baums generiert. Der Abstand vom linken Rand zum Stamm ist derselbe wie zur Spitze der Tanne
		
		for (int k = 0; k <= marginLeft; k++) {			// schreibt den linken Abstand zum Stamm
			System.out.print(" ");
		}
		System.out.println("|");						// der Stamm wird als "|" in die Konsole ausgegeben
	}
}
