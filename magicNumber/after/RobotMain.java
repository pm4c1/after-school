package magicNumber.after;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot("Smith");

        robot.order(robot.COMMAND_WALK);
        robot.order(robot.COMMAND_STOP); // 이런식으로 값을 넘겨도
        robot.order(robot.COMMAND_JUMP); // 정수값으로 들어감

        robot.order(100);

    }
}
