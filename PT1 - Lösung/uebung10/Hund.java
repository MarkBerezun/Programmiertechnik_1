package uebung10;

public class Hund {
	
	String name;
	int alter;
	
	Hund(String name, int alter) {
		
		this.name = name;
		
		setAlter(alter);
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
	
	public void setAlter(int alter) {
		
		if (alter <= 0) {
			
			System.out.println("Das Alter muss ein positiver Ganzzahlwert sein!");
			this.alter = 1;
			
		} else if (alter > 19){
			
			System.out.println(name + " ist ganz schön alt für einen Hund!");
			this.alter = alter;
			
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
