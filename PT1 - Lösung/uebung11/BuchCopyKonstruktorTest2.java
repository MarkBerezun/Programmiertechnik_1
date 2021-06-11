package uebung11;

public class BuchCopyKonstruktorTest2 {

	public static void main(String[] args) {
		
		Verlag v1 = new Verlag ("Droemer HC");
		Buch b1 = new Buch("Der Heimweg", 3426281554L, 22.99, v1);
		Buch b2 = new Buch(b1);
		System.out.println(b1.getTitel());
		System.out.println(b1.getVerlag().getName());
		System.out.println(b2.getTitel());
		System.out.println(b2.getVerlag().getName());
		
		b1.getVerlag().setName("Neuer Verlag");
		System.out.println(b1.getTitel());
		System.out.println(b1.getVerlag().getName());
		System.out.println(b2.getTitel());
		System.out.println(b2.getVerlag().getName());
	}

}
