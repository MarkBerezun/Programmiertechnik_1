package uebung13;

@SuppressWarnings("serial")
public class DogException extends Exception {

	DogException() {
		super();
	}
	
	DogException (String string){
		super(string);
	}
}
