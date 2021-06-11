package uebung13;
public class ExceptionTest {
	
	public static int rekursiveMethode1 (int zahl) {
	
	if(zahl < 0) {
		throw new IllegalArgumentException("Der Wert muss > 0 sein");
	}
	
	if (zahl < 10) {
		return zahl;
	}
	
	int letzteZiffer = zahl % 10;
	int restZahl = zahl / 10;
	
	return rekursiveMethode1(restZahl) + letzteZiffer;
	}
	
	public static void main(String[] args) {
		System.out.println(rekursiveMethode1(-5));
	}
}