package uebung13;

public class HundTest {

	public static void main(String[] args) {
		
		try {
		Hund hund2 = new Hund("Bello", -5);
		System.out.println(hund2);
		
		hund2.setAlter(7);
		System.out.println(hund2);
		}
		catch(Exception d) {
			System.out.println(d.getMessage());
		}
	}

}
