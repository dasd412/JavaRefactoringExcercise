package afterNull;

public class NullLabel extends Label{

	public NullLabel() {
		super("(none)");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		
	}
	
	@Override
	public boolean isNull() {
		return true;
	}

}
