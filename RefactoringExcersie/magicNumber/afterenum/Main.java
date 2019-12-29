package afterenum;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(RobotCommand.COMMAND_WALK.getValue()); // walk
        robot.order(RobotCommand.COMMAND_STOP.getValue()); // stop
        robot.order(RobotCommand.COMMAND_JUMP.getValue()); // jump
    }
}
