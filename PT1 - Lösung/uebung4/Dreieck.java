package uebung4;

public class Dreieck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dreieck(10);
	}
	
	public static void dreieck(int hoehe) {
		
		for(int i = 0; i < hoehe; i++) {	// führe die nachfolgende Schleife für jede Zeile aus, bis die gewünschte Höhe erreicht wurde
			
			for(int j = 0; j <= i; j++) {
			System.out.print("*");			// gib "*" in der Zeile aus, bis j = i
			}
			
			System.out.println();			// Zeilensprung
		}
	}
}
