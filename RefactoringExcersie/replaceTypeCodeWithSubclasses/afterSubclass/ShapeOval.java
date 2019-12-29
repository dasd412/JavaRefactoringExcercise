package afterSubclass;

public class ShapeOval extends Shape{

	protected ShapeOval( int startx, int starty, int endx, int endy) {
		super( startx, starty, endx, endy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		drawOval();
	}
    private void drawOval() {
        System.out.println("drawOval: " + this.toString());
        // ...
    }
	
	@Override
	public int getTypeCode() {
		return Shape.TYPECODE_OVAL;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Oval";
	}
}
