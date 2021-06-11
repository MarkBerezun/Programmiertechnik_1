package uebung9;

public class IntRefClassTest {

	public static void copy1(RefIntClass x, RefIntClass y) {
		y.b.a = x.b.a;
		y.c = x.c;
	}
	
	public static void copy2(RefIntClass x, RefIntClass y) {
		y.b = x.b;
		y.c = x.c;
	}
	
	public static void copy3(RefIntClass x, RefIntClass y) {
		y = x;
		System.out.println(x.b.a + " " + x.c);
		System.out.println(y.b.a + " " + y.c);
		y.b.a = 5;
		y.c = 0;
		System.out.println(x.b.a + " " + x.c);
		System.out.println(y.b.a + " " + y.c);
		
	}
	
	public static void main(String[] args) {
		
		RefIntClass p = new RefIntClass (4, 7);
		RefIntClass q = new RefIntClass (1, 3);
		
		q = p;
		
		System.out.println(p.b.a + " " + p.c);
		System.out.println(q.b.a + " " + q.c);
		/*
		p.b.a = 5;
		p.c = 0;
		System.out.println(p.b.a + " " + p.c);
		System.out.println(q.b.a + " " + q.c);
		*/
		q.b.a = 6;
		q.c = 2;
		System.out.println(p.b.a + " " + p.c);
		System.out.println(q.b.a + " " + q.c);
		
	}
}
