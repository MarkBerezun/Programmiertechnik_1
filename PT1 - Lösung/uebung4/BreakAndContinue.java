package uebung4;

public class BreakAndContinue {
	
	public static void main(String args[]) {
		
		/* for (int i = 0; i < 100; i++) {
			
			if (i == 50) {
				break;
			}
			
			if (i % 9 != 0) {
				continue;
			}
			
			System.out.println(i);
		} */
		
		for (int i = 0; i <= 50; i++) {
			
			if (i % 9 == 0) {
				System.out.println(i);
			}
		}
	}                                                                                                                                                                                                                                                                                                   
}
