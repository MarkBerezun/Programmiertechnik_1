package uebung6;
public class ArrayAusgeben {
	
	public static void arrayToConsole(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
		System.out.println();				
	}

	public static void main(String[] args) {
		
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		arrayToConsole(array1);
	}

}
