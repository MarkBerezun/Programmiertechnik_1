package uebung3;

public class Dekrement_Inkrement_Operatoren {

	public static void main(String[] args) {
		
		int x = 1, y = 2, z = 3;
		
		System.out.println(x--);		// (1)
		System.out.println(++x - x);	// (2)
		System.out.println(x);			// (3)
		
		if (x++ == 0) {
			System.out.println(x);		// (4)
		} else 
			System.out.println();
		System.out.println(x);			// (5)
		
		if ((y == 2) || (x++ > 0)) {
			System.out.println(x);		// (6)
		}
		System.out.println(x);			// (7)
		x += y;
		System.out.println(x);			// (8)
		
		if ((y== 2) | (x++ > 0)) {
			System.out.println(x);		// (9)
			z -= y;	
		}
		System.out.println(x);			// (10)
		System.out.println(y);			// (11)
		System.out.println(z);			// (12)
	}

}
