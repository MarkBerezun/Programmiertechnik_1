package kurse;

public class OnlineKurs extends Kurs{

	private String onlineLink = "Standard online Link auf die Homepage";
	
	public OnlineKurs(String name, String dozent, boolean sale) {
		super(name, dozent, sale);
	}
	
	public void infosZeigen() {
		
		super.infosZeigen();
		System.out.print("Weitere Infos finden Sie hier: ");
		System.out.println(onlineLink);
	}
}
