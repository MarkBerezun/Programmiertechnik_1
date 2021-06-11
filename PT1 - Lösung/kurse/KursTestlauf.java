package kurse;

public class KursTestlauf {

	public static void main(String[] args) {
		
		OnlineSynchron meinOnlineK1 = new OnlineSynchron("Englisch für Anfänger 1", "Dozent Englisch", false);
		OnlineSynchron meinOnlineK2 = new OnlineSynchron("Englisch für Anfänger 2", "Dozent Englisch", true);
		Praesenz meinPraesenzK = new Praesenz ("Englisch für Fortgeschrittene", "Dozent Englisch", true);
		OnlineAsynchron meinOnlineK3 = new OnlineAsynchron("Englisch Intermediate", "Dozent Englisch", false);
		
		Raum hoersaal1 = new Raum ("Hörsaal 1", 123);
		Praesenz meinPraesenzK2 = new Praesenz ("Englisch für Fortgeschrittene", "Dozent Englisch", true, hoersaal1);
		
		Kurs[] warenkorb = new Kurs[4];
		warenkorb[0] = meinOnlineK1;
		warenkorb[1] = meinOnlineK2;
		warenkorb[2] = meinPraesenzK;
		warenkorb[3] = meinOnlineK3;
		
		for (int i = 0; i < warenkorb.length; i++) {
			warenkorb[i].buchen();
		}
		
		for(int i = 0; i < warenkorb.length; i++) {
			warenkorb[i].infosZeigen();
		}
		
		meinPraesenzK2.setRaumNummer(666);
		System.out.println(meinPraesenzK2.getRaumNummer());
		
		Praesenz meinPraesenzK3 = new Praesenz(meinPraesenzK2);
		
		
		System.out.println(meinPraesenzK3.getRaumNummer());
	}
}
