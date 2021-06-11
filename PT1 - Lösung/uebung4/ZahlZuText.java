package uebung4;
public class ZahlZuText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 123456789;
		zahlZuText(x);

	}
	
	public static void zahlZuText(int zahl) {
		
		int stellen = stellen(zahl);
		int ziffer;
		String zahlAlsText;
		
		for(int i = stellen-1; i >= 0; i--) {
			
			ziffer = zahl / (int)Math.pow(10, i);
			zahl -= ziffer * (int)Math.pow(10, i);
			
			// System.out.print(ziffer);
			
			switch (ziffer) {
			
				case 0:
					zahlAlsText = "null";
					break;
					
				case 1:
					zahlAlsText = "eins";
					break;
					
				case 2:
					zahlAlsText = "zwei";
					break;
				
				case 3:
					zahlAlsText = "drei";
					break;
					
				case 4:
					zahlAlsText = "vier";
					break;
				
				case 5:
					zahlAlsText = "fünf";
					break;
				
				case 6:
					zahlAlsText = "sechs";
					break;
				
				case 7:
					zahlAlsText = "sieben";
					break;
					
				case 8:
					zahlAlsText = "acht";
					break;
					
				case 9:
					zahlAlsText = "neun";
					break;
			
				default: 
					zahlAlsText = "Fehler!";
					break;
			}
			
			System.out.print(zahlAlsText + " ");
		}
	}

	public static int stellen (int zahl) {
		
		int stellen = 0;
		
		while ((zahl / (int)Math.pow(10, stellen)) != 0) {
			stellen++;
		}
		
		return stellen;
	}
}
