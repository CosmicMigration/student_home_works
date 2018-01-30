package Robots;

import Robots.robotTypes.HomeRobot;
import Robots.robotTypes.Transformer;

public class RobotInit {
    private static Transformer transformer;
    private static HomeRobot homeRobot;

    private static Head head;
    private static Leg leg1;
    private static Leg leg2;
    private static Leg [] legs;

    private static Hand hand1;
    private static Hand hand2;
    private static Hand [] hands;



    public static void main(String[] args) {
        createRobotParts();
        createSimpleRobot();
        createRobotTypes();


        if( transformer.equals(homeRobot)) {
            System.out.println("Robots are equal");
        } else {
            System.out.println("Robots aren't equal");
        }

    }

    private static void createRobotParts() {
        head = new Head(true);

        leg1 = new Leg(true);
        leg2 = new Leg(true);
        legs = new Leg[2];
        legs[0] = leg1;
        legs[1] = leg2;

        hand1 = new Hand(false);
        hand2 = new Hand(true);
        hands = new Hand[2];
        hands[0] = hand1;
        hands[1] = hand2;
    }

    private static void createSimpleRobot() {
        Robot robot1 = new Robot(hands, legs, head, "Chappi");
        robot1.isReady();
    }

    private static void createRobotTypes() {
        transformer = new Transformer(hands, legs, head, "Transformer", 200);
        homeRobot = new HomeRobot(hands, legs, head, "SuperCleaning", true, false);
    }
}
