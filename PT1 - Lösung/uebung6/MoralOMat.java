package uebung6;
import java.util.Random;

public class MoralOMat {

	static String[] wortgruppe1 = { "Mut ist", "Leichtsinn ist", "Verantwortung ist", "Demokratie ist",
							 "Geld ist", "Liebe ist", "Betrug ist", "Freiheit ist", "Denken ist",
							 "Selbstlosigkeit ist", "Rekursion ist", "Egoismus ist", "Moral ist",
							 "Glück ist", "Konsum ist", "Das Leben ist", "Das Schicksal ist",
							 "Unabhängigkeit ist", "Gerechtigkeit ist", "Der Tod ist", "Programmiertechnik ist", "Ketzerei"
							};
	
	static String[] wortgruppe2 = { "letztlich", "sozusagen", "am Ende des Tages", "quasi", "genaugenommen",
							 "wirklich", "leider", "zum Glück", "durch die Blume gesagt", "rückblickend",
							 "voraussichtlich", "unter Umständen", "erwiesenermaßen", "gelinde gesagt",
							 "strenggenommen", "unterm Strich", "in gewisser Hinsicht", "primär",
							 "mitnichten", "vor allem", "entspringt aus"
							};
	
	static String[] wortgruppe3 = { "die höchste Tugend", "die Basis des Zusammenlebens", "eine gesellschaftliche Pflicht",
							 "der Anfang allen Übels", "das, wofür es sich zu leben lohnt", "falsch", "zutiefst menschlich",
							 "kein Kavaliersdelikt mehr", "völlig überschätzt", "völlig unterschätzt", "immer Gabe und Aufgabe zugleich",
							 "mit Vorsicht zu genießen", "fragwürdig", "existenzgefährdend", "der Schlüssel zum Glück", "eine Frage des Anstands",
							 "jedem selbst überlassen", "eine Fügung", "völlig willkürlich", "immer schon vorherbestimmt", "nicht mehr haltbar",
							 "unsere Rettung", "eine Illusion", "völlig überholt", "nur die Spitze des Eisbergs", "Müßiggang"
							};
	
	static Random rand = new Random();
	
	public static void moralOmat() {
		
		System.out.println(wortgruppe1[rand.nextInt(wortgruppe1.length)] + " " 
						   + wortgruppe2[rand.nextInt(wortgruppe2.length)] + " "
						   + wortgruppe3[rand.nextInt(wortgruppe3.length)] + ".");
	}
	
	public static void main(String[] args) {
		
		moralOmat();
	}

}
