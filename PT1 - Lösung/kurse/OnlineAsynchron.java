package kurse;

public class OnlineAsynchron extends OnlineKurs {
	
	public OnlineAsynchron(String name, String dozent, boolean sale) {
		super(name, dozent, sale);
	}
	
	public void buchen() {
		System.out.println("Sie haben Ihren Kurs " + this.getName() + " erfolgreich gebucht." + "Sie können gleich loslegen!");
	}

}
