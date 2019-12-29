package afterSubclass;

public class ShapeLine extends Shape{

	protected ShapeLine(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw() {
		drawLine();
	}

	private void drawLine() {
		System.out.println("drawLine: " + this.toString());
		// ...
	}

	@Override
	public int getTypeCode() {
		return Shape.TYPECODE_LINE;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Line";
	}

}
