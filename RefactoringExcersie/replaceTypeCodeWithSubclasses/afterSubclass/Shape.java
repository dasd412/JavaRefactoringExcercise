package afterSubclass;
public abstract class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;


    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    protected Shape(int startx, int starty, int endx, int endy) {
 
        _startx = startx;
        _endx = endx;
        _starty = starty;
        _endy = endy;
    }


    public abstract int getTypeCode() ;

    public abstract String getName() ;
    
    public static Shape createShape(int typeCode, int startX, int startY, int endX, int endY) {
    	switch(typeCode) {
    	case TYPECODE_LINE:return new ShapeLine(startX, startY, endX, endY);
        
    	case TYPECODE_RECTANGLE:return new ShapeRectangle( startX, startY, endX, endY);
    	
    	case TYPECODE_OVAL:return new ShapeOval( startX, startY, endX, endY);
    	
    	default:throw new IllegalArgumentException("typeCode="+typeCode);
    	}
    }

    public String toString() {
        return "[ "
            + getName() + ", "
            + "(" + _startx + ", " + _starty + ")-"
            + "(" + _endx + ", " + _endy + ") ]";
    }

    public abstract void draw() ;



}
