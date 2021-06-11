package uebung3;

public class Kurzschluss_Operatoren {

	public static void main(String[] args) {
		
		char a = 'A';
		char b = 'B';
		
		if (a == --b) {
			System.out.println("1");
		}
		
		if ((a == b) || (a++ > b)) {
			System.out.println("2");
		}
		
		System.out.println(a);

	}
}
