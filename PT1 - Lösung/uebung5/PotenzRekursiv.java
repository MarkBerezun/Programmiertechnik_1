package uebung5;

public class PotenzRekursiv {
	
	public static int potenz(int x, int y) {
		
		if (y == 0) {
			return 1;
		}
		
		else {
			return x * potenz(x, y-1);
			
		}
	}
	
	public static void main(String[] args) {
		
		int x = 3;
		int y = 3;
		
		System.out.println(potenz(x, y));
	}

}
