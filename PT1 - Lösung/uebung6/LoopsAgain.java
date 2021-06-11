package uebung6;
import java.util.Random;

public class LoopsAgain {

	static Random r = new Random();
	
	public static void zahlWuerfeln() {
		
		int ergebnis = 0;
		int versuche = 0;
		
		while (ergebnis != 6) {
			ergebnis = r.nextInt(6)+1;
			versuche++;
			System.out.println(ergebnis);
		}
		
		System.out.println("6 wurde gewürfelt nach " + versuche + " Versuchen!");
	}
	
	public static void zahlWuerfeln2() {
		
		int[] ergebnis = new int[2];
		int versuche = 0;
		
		 do {
			ergebnis[0] = r.nextInt(6)+1;
			ergebnis[1] = r.nextInt(6)+1;
			versuche++;
			System.out.println(ergebnis[0] + " " + ergebnis[1]);
		 }
			while (ergebnis[0] != ergebnis[1]);
		 
		 System.out.println("Es wurde die " + ergebnis[0] + " zweimal hintereinander gewürfelt nach " + versuche + " Versuchen!");
	}
	
	public static void zahlWuerfeln3() {
		
		int[] ergebnis = new int[2];
		int versuche = 0;
		
		 do {
			ergebnis[0] = r.nextInt(6)+1;
			ergebnis[1] = r.nextInt(6)+1;
			versuche++;
			System.out.println(ergebnis[0] + " " + ergebnis[1]);
		 }
		 	while(ergebnis[0] != 6 || ergebnis[1] != 6);
			//while (!((ergebnis[0] == 6) && (ergebnis[1] == 6)));
		
		System.out.println("Es wurde die " + ergebnis[0] + " zweimal hintereinander gewürfelt nach " + versuche + " Versuchen!");
	}
	
	public static void main(String[] args) {
		
		zahlWuerfeln3();

	}
}
