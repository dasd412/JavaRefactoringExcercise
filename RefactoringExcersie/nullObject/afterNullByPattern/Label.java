package afterNullByPattern;

public class Label {
    private final String _label;
    public Label(String label) {
        _label = label;
    }
    public void display() {
        System.out.println("display: " + _label);
    }
    public String toString() {
        return "\"" + _label + "\"";
    }
    
    public boolean isNull() {
    	return false;
    }
    
    
    public static Label newNull() {
    	return NullLabel.getInstance();
    }
    
    private static class NullLabel extends Label{

    	private static final NullLabel singleton=new NullLabel();
    	
    	public NullLabel() {
    		super("(none)");
    		// TODO Auto-generated constructor stub
    	}
    	
    	public static Label getInstance() {
			// TODO Auto-generated method stub
			return singleton;
		}

		@Override
    	public void display() {
    		
    	}
    	
    	@Override
    	public boolean isNull() {
    		return true;
    	}

    }
    
}
