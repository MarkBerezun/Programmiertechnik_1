package uebung9;

public class Hafen {
	
	private Boot[] liegeplaetze;
	private static int nochFreiePlaetze;
	private static int liegeplatznummer = 1;
	
	Hafen(int liegeplaetze) {
		
		nochFreiePlaetze = liegeplaetze;
		this.liegeplaetze = new Boot[liegeplaetze];
		
	}
	
	public int getNochFreiePlaetze() {
		
		return nochFreiePlaetze;
	}
	
	public boolean nochFreiePlaetze() {
		
		if (nochFreiePlaetze > 0) {
			
			return true;
		}
		
		else {
			return false;
			
		}
	}
	
	public int addBoot(Boot b) {
		
		if (nochFreiePlaetze > 0) {
			
			liegeplaetze[liegeplatznummer-1] = b;
			b.setLiegeplatznummer(liegeplatznummer);
			nochFreiePlaetze--;
			return liegeplatznummer++;
			
		} else {
			
			return -1;
		}
	}
	
	public Boot groesstesBoot() {
		
		if (nochFreiePlaetze != liegeplaetze.length) {
			
			Boot groesstesBoot = liegeplaetze[0];
			
			for (Boot b: liegeplaetze) {
				
				if (b != null) {
					
					if (b.getGroesse() > groesstesBoot.getGroesse()) {
						groesstesBoot = b;
					}
				}
			}
				
			return groesstesBoot;
			
		} else {
			
			System.out.println("Keine Boote im Hafen, Käpt'n!");
			return new SegelBoot(666, "Geisterschiff");
		}
	}
		
	public Boot kleinstesBoot() {
		
		if (nochFreiePlaetze != liegeplaetze.length) {
	
			Boot kleinstesBoot = liegeplaetze[0];
			
			for (Boot b: liegeplaetze) {
				
				if (b != null) {
					
					if (b.getGroesse() < kleinstesBoot.getGroesse()) {
					kleinstesBoot = b;
					}
				}
			}
				
			return kleinstesBoot;
			
			} else {
				
				System.out.println("Keine Boote im Hafen, Käpt'n!");
				
			}
			
			return new SegelBoot(666, "Geisterschiff");
		}
	
	public void sortiereBoote() {
	
		for(int i = liegeplaetze.length - 1; i > 0; i--) {
				
				for(int j = 0; j < i; j++) {
			
					if ((liegeplaetze[j+1] != null) && (liegeplaetze[j].getGroesse() > liegeplaetze[j+1].getGroesse())) {
						
						Boot temp = liegeplaetze[j+1];
						liegeplaetze[j+1] = liegeplaetze[j];
						liegeplaetze[j] = temp;
					}
				}	
		}
	}
	
	public void auflistungBoote() {
		
		for (Boot b: liegeplaetze) {
			
			if (b != null) {
				System.out.println(b.toString());
			}
		}
	}
	
}
