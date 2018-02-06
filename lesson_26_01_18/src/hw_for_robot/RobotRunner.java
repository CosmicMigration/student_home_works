package hw_for_robot;

import hw_for_robot.robot_hw.*;
import hw_for_robot.robot_hw.robotPart.Body;
import hw_for_robot.robot_hw.robotPart.Hand;
import hw_for_robot.robot_hw.robotPart.Head;
import hw_for_robot.robot_hw.robotPart.Leg;

public class RobotRunner {
    public static void main(String[] args) {
       Robot superRobot = new SuperRobot("SuperPower");
       Robot superRobot2 = new SuperRobot("SuperPower");

       Robot learnRobot1 = new LearnRobot("SuperLearn");
       Robot learnRobot2 = new LearnRobot("SuperLearn");

        Robot transformer1 = new Transformer("SuperTrans");
        Robot transformer2 = new Transformer("SuperTrans");

       Robot[] robots = {superRobot, superRobot2, learnRobot1, learnRobot2, transformer1, transformer2};

        int[] robotsHashCode = new int[6];

        robotsHashCode[0] = superRobot.hashCode();
        robotsHashCode[1] = superRobot2.hashCode();
        robotsHashCode[2] = learnRobot1.hashCode();
        robotsHashCode[3] = learnRobot2.hashCode();
        robotsHashCode[4] = transformer1.hashCode();
        robotsHashCode[5] = transformer2.hashCode();

        for (int i : robotsHashCode) {
            if(i==superRobot.hashCode()){

            }
        }
    }
}
