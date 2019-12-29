package afterenum;

public class Robot {
    private final String _name;

    
    
    
    public Robot(String name) {
        _name = name;
    }
    public void order(int command) {
        if (command == RobotCommand.COMMAND_WALK.getValue()) {
            System.out.println(_name + " walks.");
        } else if (command == RobotCommand.COMMAND_STOP.getValue()) {
            System.out.println(_name + " stops.");
        } else if (command == RobotCommand.COMMAND_JUMP.getValue()) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}
