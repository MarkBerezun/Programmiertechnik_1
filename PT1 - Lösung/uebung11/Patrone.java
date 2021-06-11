package uebung11;

public class Patrone {

	private boolean istSchwarzweiss;

	public Patrone() {	
	};
	
	public Patrone(Patrone patrone) {
		this.istSchwarzweiss = patrone.istSchwarzweiss;
	}
	
	
	// Getter/Setter
	
	public boolean getIstSchwarzweiss() {
		return istSchwarzweiss;
	}
	
	public void setIstSchwarzweiss(boolean istSchwarzweiss) {
		this.istSchwarzweiss = istSchwarzweiss;
	}
	
}


