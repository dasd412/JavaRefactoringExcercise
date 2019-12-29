package afterException;

public class InvalidCommandException extends Exception{

	public InvalidCommandException() {
	
	}
	
	public InvalidCommandException(String name) {
		super(name);
	}
	

}
