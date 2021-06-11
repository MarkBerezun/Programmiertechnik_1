package uebung13;

public class TurboLernenFuerPruefungen {

	public static void lernen(boolean nochGenugZeit) throws PruefungsPanik {
		if (nochGenugZeit) {
			System.out.println("Groﬂartiges Zeitmanagement! Weiter so!");
		}
		else {
			throw new PruefungsPanik("In der Ruhe liegt die Kraft.");
			}
	}
}
