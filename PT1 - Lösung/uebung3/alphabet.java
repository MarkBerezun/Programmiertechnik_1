package uebung3;

public class alphabet {

	public static void main(String[] args) {
		
		char letter = 'A'; //ASCII-Wert = 65
		
		for (int count = 0; count < 26; count++) {  // Gehe die nächsten 25 Stellen des Alphabets durch ("letter" ist bereits als A initialisiert und wird zuerst ausgegeben)
			
			System.out.print(letter);				// Gebe "letter" in die Konsole aus (kein Zeilensprung)
			letter++;								// nächste Stelle im Alphabet
		}
	}
}
