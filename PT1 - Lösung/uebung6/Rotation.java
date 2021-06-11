package uebung6;
public class Rotation {

	public static int[] rotateByOne (int[] array, String direction) {		// nimmt ein int-Array und einen Stringwert ("right" oder "left") für die Rotationsrichtung an
																			// TODO: es müsste möglich sein, den Code je nach Rotationsrichtung nicht zu wiederholen. 
		if (direction == "right") {											// Rotation nach rechts
			
			int temp = array[array.length-1];								// speichere letzte Stelle des arrays temporär
			
			for (int i = array.length-2; i >= 0; i--) {						// tausche jede Stelle des Arrays mit ihrem linken Nachbarn (von links nach rechts)
				//ArrayAusgeben.arrayToConsole(array);
				array[i+1] = array[i];
			}
			
			array[0] = temp;												// gespeicherte letzte Stelle = erste Stelle des Arrays
			return array;
		}
		else if (direction == "left") {										// Rotation nach links
			
			int temp = array[0];											// speichere erste Stelle des arrays temporär
			
			for (int i = 1; i < array.length; i++) {						// tausche jede Stelle des Arrays mit ihrem rechten Nachbarn (von rechts nach links)
				//ArrayAusgeben.arrayToConsole(array);
				array[i-1] = array[i];										
			}
			
			array[array.length-1] = temp;									// gespeicherte erste Stelle = letzte Stelle des Arrays
			return array;
		}
		else {
			System.out.println("Error: Method \"rotateByOne\" takes in string arguments \"left\" or \"right\"!");	// Fehlermeldung bei Übergabe eines falschen String-Wertes
			return array;
		}
	}
		
	public static int[] rotateArray(int[] array, int times, String direction) {
		
		
		times %= array.length;													// Anzahl Rotationen modulo Länge Array = tatsächliche Anzahl Rotationen. Rotiert die Funktion gleich der Anzahl Elemente im Array, erhalten wir wieder die Ausgangsanordnung, also ist jeder dieser Durchläufe unnötig. Mit Modulo erhalten wir die Anzahl Durchläufe (times), mit denen das Array tatsächlich verändert wird.
		for (int i = 0; i < times; i++) {
			
			rotateByOne(array, direction);										// rufe times mal die Funktion rotateByOne() mit den vorgegebenen Parametern auf. Faul aber sicher.
			
		}
		
		return array;
		
	}
		

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		
		ArrayAusgeben.arrayToConsole(rotateArray(array, 15, "left"));

	}

}
