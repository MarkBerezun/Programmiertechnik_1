package kurse;

public class Praesenz extends Kurs {
	
	private Raum raum;
	
	public Praesenz (String name, String dozent, boolean sale) {
		super(name, dozent, sale);
	}
	
	public Praesenz (String name, String dozent, boolean sale, Raum raum) {
		super(name, dozent, sale);
		this.raum = new Raum(raum);
	}
	
	public Praesenz(Praesenz copyPraesenz) {

		super(copyPraesenz);
		this.raum = new Raum(copyPraesenz.raum);
	}
	
	public int getRaumNummer() {
		return raum.getNummer();
	}
	
	public void setRaumNummer(int nummer) {
		raum.setNummer(nummer);
	}
}
