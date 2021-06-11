package uebung13;

public class passByCopy {
	
	public static void machWas(int x) {
		x = x+1;
		System.out.println("Das x in machWas:" + x);
	}

	public static void main(String[] args) {
		int x = 10;
		machWas(x);
		System.out.println("Das x nach machWas: " + x);

	}

}
