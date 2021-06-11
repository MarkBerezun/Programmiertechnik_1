package uebung5;

public class Fibunacci {

public static int fibunacci_iterative(int index) {

	if (index < 3) {									// ist der gewählte Index der Fibunacci-Folge zwischen 0 - 2 ist keine Berechnung nötig bzw. umständlich; gib den Wert 1 zurück
		return 1;
	}
	
	int zahl1 = 1;										// initialisiere die drei int-Werte zahl1-3 entsprechend den ersten drei Stellen einer Fibunacci-Folge (1,1,2)
	int zahl2 = 1;
	int zahl3 = zahl1 + zahl2;

	for (int i = 2; i < index; i++) {					// berechne die nächste Zahl der Folge, bis der gewünschte Indexwert erreicht wird 
		
		zahl3 = zahl2 + zahl1;							// berechne "vorderste" Zahl der Reihe aus (Summe der beiden letzen Zahlen); setze die Werte der Zahlen um eine Stelle nach "vorne"
		zahl1 = zahl2;
		zahl2 = zahl3;		
	}
	
	return zahl3;										// gib die derzeit "vorderste" Zahl der Fibunacci-Reihe aus; entspricht dem Zahlenwert an gewählter Indexstelle
				
}
		
public static int fibunacci_recursive(int index) {
		
	if (index == 0  | index == 1) {
		return index;
	}
		
	else return (fibunacci_recursive(index-1) + fibunacci_recursive(index-2));
		
}

public static void main(String[] args) {
	
	System.out.println(fibunacci_iterative(8));
	System.out.println(fibunacci_recursive(8));
	}
}
