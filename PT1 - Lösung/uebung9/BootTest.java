package uebung9;

public class BootTest {

	public static void main(String[] args) {
		
		Hafen meinHafen = new Hafen(6);
		Boot a = new SegelBoot(255, "Enterprise");
		Boot b = new MotorBoot(568, "Defiance");
		/* Boot c = new RuderBoot(180, "Sitting Duck");
		Boot d = new SegelBoot(4500, "Interceptor");
		Boot e = new SegelBoot(3656, "Black Pearl");
		Boot f = new MotorBoot(25050, "Bismarck");
		Boot g = new MotorBoot(26300, "Yamato"); */
		
		meinHafen.addBoot(a);
		meinHafen.addBoot(b);
		//System.out.println(meinHafen.addBoot(c));
		//System.out.println(meinHafen.addBoot(d));
		//System.out.println(meinHafen.addBoot(e));
		//System.out.println(meinHafen.addBoot(f));
		//System.out.println(meinHafen.addBoot(g));
		
		meinHafen.auflistungBoote();
		System.out.println();
		//System.out.println(f.getLiegeplatznummer());

		System.out.println(meinHafen.groesstesBoot());
		System.out.println();
		System.out.println(meinHafen.kleinstesBoot());
		System.out.println();
		meinHafen.sortiereBoote();
		meinHafen.auflistungBoote();
	}
}
