package uebung11;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reifen reifen = new Reifen("Allwetterreifen", "Goodyear");
		Auto auto = new Auto("AB-SP-1203", 13000, 60, 20, 5, reifen);
		
		auto.fahren(50);
		auto.tanken(20);
		auto.tanken(30);
	}

}
