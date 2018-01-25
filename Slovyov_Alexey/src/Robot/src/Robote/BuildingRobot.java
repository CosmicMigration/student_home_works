package Robote;

import BodyParts.Arms;
import BodyParts.Head;
import BodyParts.Legs;
import BodyParts.Robot;

public class BuildingRobot {
    public static void main(String[] args) {

        Robot verter=new Robot();

        Head firstHead=new Head(" Я Голова");
        Arms leftArms=new Arms("Левая рука");
        Arms rightArms=new Arms("Правая рука");
        Legs leftLegs=new Legs("Левая нога");
        Legs rightLegs=new Legs("Правая нога");


        verter.setBasicHead(firstHead);
        verter.setBasicArmsLeft(leftArms);
        verter.setBasicArmsRight(rightArms);
        verter.setBasicLegsRight(rightLegs);
        verter.setBasicLegsLeft(leftLegs);

//        System.out.println(verter.getBasicHead().getaHead()+verter.getBasicArms().getArm());
//        System.out.println(verter.getBasicHead().getaHead());
        Robot robot1=new Robot(firstHead,leftLegs,rightArms,leftArms);
        Robot robot2=new Robot(firstHead,leftLegs,rightLegs,rightArms);
        Robot robot3=new Robot(leftLegs,rightLegs,leftArms,rightArms);












    }


}
