package applyingEnum;

public class LunchSet {

	private LunchType lunchSet;
	private DrinkType drinkSet;
	
	public LunchSet(LunchType lunch, DrinkType drink) {
		this.lunchSet=lunch;
		this.drinkSet=drink;
	}
	
	public String toString() {
		return "[ LunchSet: "+lunchSet+", "+drinkSet+"]";
	}
	
}
