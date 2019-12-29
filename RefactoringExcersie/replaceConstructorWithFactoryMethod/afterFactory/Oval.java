package afterFactory;

public class Oval extends Shape{

	protected Oval( int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawOval();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "OVAL";
	}
	
    private void drawOval() {
        System.out.println("drawOval: " + this.toString());
        // ...
    }

}
