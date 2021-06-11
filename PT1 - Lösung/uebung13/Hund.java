package uebung13;

public class Hund {
	
	String name;
	int alter;
	
	Hund(String name, int alter) throws DogException {
		
		setAlter(alter);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAlter() {
		return alter;
	}
	
	public void setAlter(int alter) throws DogException {
		
		if (alter < 0) {
			
			throw new DogException("Das Alter des Hundes muss ein positiver Ganzzahlwert sein!");
			
		} else if (alter > 19){
			
			throw new DogException("Ganz schön alt für einen Hund!");
			
		} else {
			
			this.alter = alter;
		}
	}
	
	public int alterInPersonenJahren() {
		
		return 7 * alter;
	}
	
	public String toString() {
		
		return "Name: " + name + "; Alter: " + alter + " (in Menschenjahren: " + alterInPersonenJahren() + ")";
	}
}
