package afterFactory;

public class Rectangle extends Shape{

	protected Rectangle( int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawRectangle();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "RECTANGLE";
	}

    private void drawRectangle() {
        System.out.println("drawRectangle: " + this.toString());
        // ...
    }
	
}
