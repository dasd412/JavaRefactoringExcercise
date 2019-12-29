package afterFactory;

public class Line extends Shape{

	
	protected Line( int startx, int starty, int endx, int endy) {
		super( startx, starty, endx, endy);
		// TODO Auto-generated constructor stub
	}
	
 


	private void drawLine() {
        System.out.println("drawLine: " + this.toString());
        // ...
    }

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawLine();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		 return "LINE";
	}
}
