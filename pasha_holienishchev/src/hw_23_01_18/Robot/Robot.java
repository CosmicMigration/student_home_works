package Homeworks.HomeWork_23_01.Robot;

/**
 * Created by java on 26.01.2018.
 */
public class Robot {
    private static Arm arm1;
    private static Body body1;
    private static Head head1;
    private static Leg leg1;

    public Robot() {
    }

    public static void getRobotInfo() {
        if (arm1.checkArms(true, 2) == true && body1.checkBody(true) == true && head1.checkHead(true) == true && leg1.checkLeg(true, 2) == true) {
            System.out.println("Робот собран");
        } else {
            System.out.println("Робот не собран!");
        }
    }
}
