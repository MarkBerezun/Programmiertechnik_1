package uebung5;

public class MethodenUeberladen {

	public static void machWas (long x, double y, double z) {
		System.out.println("ldd");
	}
	
	public static void machWas (long x, long y, double z) {
		System.out.println("lld");
	}
	
	public static void machWas (long x, long y, long z) {
		System.out.println("lll");
	}
	
	public static void machWas ( double x, long y, double z) {
		System.out.println("dld");
	}
	
	public static void main(String[] args) {
		
		long a = 3465;
		double b = 3.14;
		
		machWas(a, a, a);	// Ausgabe: "lll"
		machWas(a, a, b);	// Ausgabe: "lld"
		machWas(a, b, a); 	// Methode mit (long, double, long) nicht spezifiziert, 3. long wird als double gecastet, Ausgabe: "ldd"
		machWas(a, b, b); 	// Ausgabe: "ldd"
		//machWas(b, b, b);	// Methode mit (double, double, double) nicht spezifiziert, kein implizites Casting möglich
		//machWas(b, b, a);	// Methode mit (double, double, long) nicht spezifiziert, kein implizites Casting möglich
		machWas(b, a, b);	// Ausgabe: "dld"
		machWas(b, a, a); 	// Methode mit (double, long, long) nicht spezifiziert, 3. long wird als double gecastet, Ausgabe: "dld"
		}

}
