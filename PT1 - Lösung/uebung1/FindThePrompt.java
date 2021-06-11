package uebung1;

public class FindThePrompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		int y = 0;
		while (x < 5) {
		
			if (y > 4) {
				y = y - 1;
				}
			y = y + 2;// hier kommt der Block rein
			
		System.out.print(x + "" + y + " ");
		
		x = x + 1;
		}
	}
}
