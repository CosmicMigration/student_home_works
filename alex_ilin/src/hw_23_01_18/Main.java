package hw_23_01_18;

import hw_23_01_18.robot_task.*;

public class Main {
    public static void main(String[] args) {
         Leg leg = new Leg();
         Head head = new Head();
         Arm arm = new Arm();
        Body corpus= new Body();

        System.out.println("Цех по производству роботов.\nОтчет:");
        Robot Robot_v1 = new Robot(head, leg, leg, arm, arm, corpus);
        System.out.println("\nБракованные роботы:\n");
        Robot Robot_v2 = new Robot(head,  leg, arm, arm, corpus);
        System.out.println();
        Robot Robot_v3 = new Robot(leg, head, arm, arm, corpus);
        System.out.println();
        Robot Robot_v4 = new Robot(leg, leg, arm, arm, corpus);
        System.out.println();
        Robot Robot_v5 = new Robot(head, leg, leg, arm, corpus);
        System.out.println();
        Robot Robot_v6 = new Robot(head, leg, leg, arm, arm);
        System.out.println();
        Robot Robot_v7 = new Robot( leg, leg,head, corpus);
        System.out.println();
        Robot Robot_v8 = new Robot(head, arm, arm, corpus);
        System.out.println();
        Robot Robot_v9 = new Robot( leg, leg, head, arm, corpus);
        System.out.println();
        Robot Robot_v10 = new Robot( leg, leg, arm, arm);
        System.out.println();
        Robot Robot_v11 = new Robot(corpus);
    }
}
