package afterDuplicate;

import java.util.ArrayList;
import java.util.List;

public class Value {
	
	private int value=0;
	private final List<ValueListener>listeners=new ArrayList<ValueListener>();
	
	public void addListener(ValueListener listener) {
		listeners.add(listener);
	}
	
	public Value(int value) {
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyToListeners();
	}

	private void notifyToListeners() {
		// TODO Auto-generated method stub
		for(ValueListener listener:this.listeners) {
			listener.valueChanged(new ValueChangeEvent(this));
		}
	}
	
	

}
