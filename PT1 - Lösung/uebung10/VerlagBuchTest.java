package uebung10;

public class VerlagBuchTest {

	public static void machZeugMitBuch(Buch b) {
		Buch b1 = new Buch (b.getVerlag());
		b1.setVerlag(null);
	}
	public static void main(String[] args) {

		Verlag verlag1 = new Verlag ("Verlag 1");
		Verlag verlag2 = new Verlag ("Verlag 2");
		
		Buch buch1 = new Buch(verlag1);
		Buch buch2 = new Buch(verlag1);
		Buch buch3 = new Buch(verlag2);
		Buch buch4 = buch2;
		buch4 = null;
		buch2 = buch4;
		buch4 = buch1;
		
		machZeugMitBuch(buch3); // Hat Buch 3 noch einen Verlag?
		
		System.out.println(buch1.getVerlag().getName());
		System.out.println(buch3.getVerlag().getName());
		System.out.println(buch4.getVerlag().getName());
	}

}
