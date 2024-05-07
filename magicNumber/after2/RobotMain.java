package magicNumber.after2;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot("Smith");

        robot.order(Robot.Command.WALK);
        robot.order(Robot.Command.STOP); // 이런식으로 값을 넘겨도
        robot.order(Robot.Command.JUMP); // 정수값으로 들어감

        // robot.order(100); <- 정수값 입력이 error
    }
}
