package uebung13;

public class TurboLernenFuerPruefungenTestlauf {

	public static void main(String[] args) {
		
		try {
			TurboLernenFuerPruefungen.lernen(false);
		}
		catch (PruefungsPanik p) {
			System.out.println(p.getMessage());
			
		}
	}
}
