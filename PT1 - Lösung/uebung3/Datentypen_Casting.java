package uebung3;

public class Datentypen_Casting {

	public static void main(String[] args) {
		
		variante1();
		System.out.println();
		variante2();
		
	}
	
	static void variante1() {
		
		int testInt = 31 / 7;
		float testFloat = 31 / 7;
		double testDouble = 31 / 7;
		
		System.out.println("testInt" + " " + testInt);			// Ausgabe 1
		System.out.println("testFloat" + " " + testFloat);		// Ausgabe 2
		System.out.println("testDouble" + " " + testDouble);	// Ausgabe 3
	}
	static void variante2() {
		
		int testInt = 31 / 3;
		float testFloat = 31f / 3f;
		double testDouble = 31d / 3d;
		
		System.out.println("testInt" + " " + testInt); 			// Ausgabe 4
		System.out.println("testFloat" + " " + testFloat);		// Ausgabe 5
		System.out.println("testDouble" + " " + testDouble);	// Ausgabe 6
	}
}
