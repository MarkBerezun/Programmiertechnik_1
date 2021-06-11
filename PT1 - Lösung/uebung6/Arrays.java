package uebung6;

public class Arrays {

	public static void main(String[] args) {
		int[] myArr1 = {1, 2, 3, 4, 5};
		int[] myArr2;
		int sum = 0;
		
		myArr2 = myArr1;

		for (int i = 0; i < myArr1.length; i++) {
			myArr2[i] = myArr1[i];
		}
		
		for (int i = 0; i < myArr2.length; i++) {
			myArr2[i] = myArr1[i] - 1;
		}
		
		// Ausgabe myArr1
		for (int i = 0; i < myArr1.length; i++) {
			System.out.print(myArr1[i]+ " ");
		}
		System.out.println();
		
		//Ausgabe myArr2
		for (int i = 0; i < myArr1.length; i++) {
			System.out.print(myArr2[i]+ " ");
		}
		System.out.println();
		
		for (int i = 0; i < myArr1.length; i++) {
			sum = sum + myArr1[i];
		}
		System.out.println(sum);
		
		for (int i = 0; i < myArr2.length; i++) {
			sum = sum + myArr2[i];
		}
		
		System.out.println(sum);
		
		myArr2 = new int[myArr1.length];
		
		for (int i = 0; i < myArr1.length; i++) {
			myArr2[i] = myArr1[i];
		}
	}

}
