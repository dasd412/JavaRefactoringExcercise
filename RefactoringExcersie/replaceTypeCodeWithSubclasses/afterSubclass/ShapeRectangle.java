package afterSubclass;

public class ShapeRectangle extends Shape{

	protected ShapeRectangle( int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw() {
		drawRectangle();
	}
	
	 
    private void drawRectangle() {
        System.out.println("drawRectangle: " + this.toString());
        // ...
    }
	

	@Override
	public int getTypeCode() {
		return Shape.TYPECODE_RECTANGLE;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}
}
