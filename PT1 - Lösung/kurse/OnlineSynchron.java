package kurse;

public class OnlineSynchron extends OnlineKurs {
	
	private String konferenzLink = "Konferenz-Link";
	
	public OnlineSynchron(String name, String dozent, boolean sale) {
		super(name, dozent, sale);
	}
	
	public void infosZeigen() {
		super.infosZeigen();
		System.out.print("Wir freuen uns auf Sie in der Konferenz: ");
		System.out.println(konferenzLink);
	}
}
