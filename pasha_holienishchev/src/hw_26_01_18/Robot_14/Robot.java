package hw_26_01_18.Robot_14;

import hw_26_01_18.Robot_14.RobotParts.Arm;
import hw_26_01_18.Robot_14.RobotParts.Body;
import hw_26_01_18.Robot_14.RobotParts.Head;
import hw_26_01_18.Robot_14.RobotParts.Leg;

/**
 * Created by java on 26.01.2018.
 */
public abstract class Robot {
    private static Arm arm1 = new Arm(true, 2);
    private static Body body1 = new Body(true);
    private static Head head1 = new Head(true);
    private static Leg leg1 = new Leg(true, 2);

    public Robot() {
    }

    public static void getRobotInfo() {
        if (arm1.checkArms() == true && body1.checkBody() == true && head1.checkHead() == true && leg1.checkLeg() == true) {
            System.out.println("Робот собран");
        } else {
            System.out.println("Робот не собран!");
        }
    }


}
