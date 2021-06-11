package uebung5;

public class ggT {
	
	public static void ggT_Recursive(int a, int b) {
		
		if (a%b == 0) {
			System.out.println("ggT = " + b);
		}
		
		else 
			
			ggT_Recursive(b, (a%b));
		
	}
	
	public static void ggT_Iterative(int a, int b) {
		
		int temp;
		
		while (a%b != 0) {
			
			temp = b;
			b = a%b;
			a = temp;
		}
		
		System.out.println("ggT = " + b);
	}

	public static void main(String[] args) {
		
		int a = 524, b = 24;
		
		ggT_Recursive(a, b);
		ggT_Iterative(a, b);
			
	}

}
