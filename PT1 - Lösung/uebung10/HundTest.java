package uebung10;

public class HundTest {

	public static void main(String[] args) {
		
		Hund hund1 = new Hund("Schnuffel", 0);
		Hund hund2 = new Hund("Bello", 5);
		Hund hund3 = new Hund("Lassie", 30);
		System.out.println();
		System.out.println(hund1.toString());
		System.out.println(hund2.toString());
		System.out.println(hund3.toString());
		System.out.println();
		hund3.setAlter(-5);
		
		System.out.println(hund3.toString());
	}

}
