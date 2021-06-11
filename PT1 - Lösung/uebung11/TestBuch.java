package uebung11;

public class TestBuch {

	public static void main(String[] args) {
		
		Buch b1 = new Buch ("Der Heimweg", 3426281554L, 22.99);
		Buch b2 = b1;
		
		//System.out.println(b1 == b2);
		
		Buch b3 = new Buch(b1);

		b1.setTitel("Die Rückkehr");
		b2.setTitel("Der steinige Weg des Kopierens");
		b3.setTitel("Kopieren doch nicht so schwer?");
		System.out.println(b1.getTitel());
		System.out.println(b2.getTitel());
		System.out.println(b3.getTitel());
		
		System.out.println(b1 == b3);

	}

}
