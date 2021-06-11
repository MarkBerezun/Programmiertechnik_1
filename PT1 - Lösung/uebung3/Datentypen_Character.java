package uebung3;

public class Datentypen_Character {

	public static void main(String[] args) {
		
		char zahl = 77;
		char zeichen = 'M';
		
		System.out.println(zahl);
		System.out.println(zeichen);
		
		System.out.println(zahl + 1);
		System.out.println(zeichen + 1);
		
		zahl = (char) (zahl + 1);
		System.out.println(zahl);
		zeichen = (char) (zeichen + 1);
		System.out.println(zeichen);
	}

}
