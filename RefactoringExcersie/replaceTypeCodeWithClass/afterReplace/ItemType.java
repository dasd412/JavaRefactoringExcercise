package afterReplace;

public class ItemType {

	private int typeCode;
	public static final ItemType BOOK=new ItemType(0);
	public static final ItemType DVD=new ItemType(1);
	public static final ItemType SOFTWARE=new ItemType(2);
	
	private ItemType(int typeCode) {
		// TODO Auto-generated constructor stub
		this.typeCode=typeCode;
	}
	
	public int getTypeCode() {
		return this.typeCode;
	}
	



	
}
