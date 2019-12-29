package exampleException;

public class AboutSomethingException extends Exception{

	public AboutSomethingException() {
		
	}
	
	public AboutSomethingException(String name) {
		super(name);
	}
	
}
