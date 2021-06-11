package uebung11;

public class Verlag {
	
	private String name;
	
	Verlag(String name) {
		this.name = name;
	}
	
	Verlag(Verlag verlag) {
		this.name = verlag.name;
	}
	
	// Getter/Setter
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

}
