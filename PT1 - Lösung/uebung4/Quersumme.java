package uebung4;

public class Quersumme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		
		System.out.println(quersumme(x));

	}
	
	public static int quersumme(int zahl) {
		
		int quersumme = 0;
		
		while(zahl != 0) {
			
			quersumme += (zahl % 10);
			zahl /= 10;
		}
		
		return quersumme;
	}
}
