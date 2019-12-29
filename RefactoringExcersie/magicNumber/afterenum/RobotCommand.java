package afterenum;

public enum RobotCommand {

	COMMAND_WALK(0),COMMAND_STOP(1),COMMAND_JUMP(2);
	private int value;
	
	RobotCommand(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	
	
}
