package uebung6;

public class ArrayCopy {

	public static int[] arrayCopy(int[] array) {
		
		int[] arrayCopy = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			
			arrayCopy[i] = array[i];
		}
		
		return arrayCopy;
	}
	
	public static void main(String[] args) {
		

		int[] array1 = {1, 2, 3, 4, 5};
		
		int[] array2 = arrayCopy(array1);
		
		System.out.print("Array 2: ");
		ArrayAusgeben.arrayToConsole(array2);
		System.out.print("Array 1: ");
		ArrayAusgeben.arrayToConsole(array1);
		
		array2[2] = 8;
		
		System.out.print("Array 2: ");
		ArrayAusgeben.arrayToConsole(array2);
		System.out.print("Array 1: ");
		ArrayAusgeben.arrayToConsole(array1);
	}

}
