package Robot;

import Robot.ComponentsRobot.Hand;
import Robot.ComponentsRobot.Head;
import Robot.ComponentsRobot.Leg;
import Robot.ComponentsRobot.Torso;

public class RobotMain {
    private static Robot robot = new Robot();

    public static void main(String[] args) {
        Head head = new Head();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        Leg leg1 = new Leg();
        Leg leg2 = new Leg();
        Torso torso = new Torso();

        robot.setHead(head);
        robot.setHand1(hand1);
        robot.getLeg1();
        robot.getHead().speak();
        robot.getHand1().write();
        robot.getLeg1().run();

        Robot robot1 = new Robot(head,hand1,hand2,leg1,leg2,torso);
        Robot robot2 = new Robot(head,hand1,leg1,leg2,torso);
        Robot robot3 = new Robot(hand1,hand2,leg1,leg2,torso);
    }
}
