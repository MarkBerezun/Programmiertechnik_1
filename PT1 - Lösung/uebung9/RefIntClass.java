package uebung9;

public class RefIntClass {

	public IntClass b;
	public int c;
	
	public RefIntClass(int b, int c) {
		this.b = new IntClass(b);
		this.c = c;
	}
}
