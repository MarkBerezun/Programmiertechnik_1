package uebung5;

public class StringReverse {
	
	static char temp;									// speichert einen char-Wert temporär
	static int index;									// Index-Ziffer des Strings
	static String result = "";
	static String lastChar;
	
	public static void stringReverse(String string) {
		
		if (index == (string.length()/2))				// Abbruchbedingung: "index" erreicht die Hälfte des Strings
			System.out.println(string);
		
		else {
			char[] charArray = string.toCharArray();				// Umwandeln in char-Array...
			temp = charArray[index];								// vertausche charArray[index] mit dem Zeichen, das [index] Stellen rechts von der letzten Stelle liegt (also Länge des Strings -1, da Index bei 0 beginnt)
			charArray[index] = charArray[string.length() -1 -index];
			charArray[string.length() -1 -index] = temp;
			string = String.valueOf(charArray);						// wandle Array wieder in String um, speichere in string
			index ++;												// nächste Index-Position
			stringReverse(string);									// Rekursion	
		}
	}

		public static void stringReverse2(String string) {						// Methode ohne Umwandlung in Char-Array	
	
			if (string.length() == 0) {											// Abbruchbedingung: wenn "string" leer, gib "result" aus
			System.out.println(result);
		}
		
		else {
			result += string.substring(string.length() -1, string.length());	// verkette die letzte Stelle des Strings mit "result"
			string = string.substring(0, string.length() -1);					// neuer String zur Übergabe an Rekursion ist der String ohne letzte Stelle
			stringReverse2(string);												// Rekursion
		}
	}
	
	public static void main(String[] args) {
		String string2 = "Satz mit X: war wohl nix!";
		String string = "Hallo";
		stringReverse2(string);
	}

}
