package kurse;

public class Raum {

	private String name;
	private int nummer;
	
	public Raum(String name, int nummer) {
		this.name = name;
		this.nummer = nummer;
		}
	
	public Raum(Raum copyRaum) {
		this.name = copyRaum.name;
		this.nummer = copyRaum.nummer;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNummer() {
		return nummer;
	}
	
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

}
