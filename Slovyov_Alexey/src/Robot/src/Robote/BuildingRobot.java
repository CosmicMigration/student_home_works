package Robote;

import BodyParts.Arms;
import BodyParts.Head;
import BodyParts.Legs;
import BodyParts.Robot;
import Three_Robots.RobotFire;
import Three_Robots.RobotRpg;
import Three_Robots.RobotShooter;

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
//        Robot robot1=new Robot(firstHead,leftLegs,rightArms,leftArms);//через конструктор
//        Robot robot2=new Robot(firstHead,leftLegs,rightLegs,rightArms);
//        Robot robot3=new Robot(leftLegs,rightLegs,leftArms,rightArms);

        RobotFire fired=new RobotFire(firstHead,leftLegs,rightLegs,leftArms,rightArms,30);
        RobotFire fired1=new RobotFire(firstHead,leftLegs,rightLegs,leftArms,rightArms,30);
        RobotRpg rpged=new RobotRpg(firstHead,leftLegs,rightLegs,leftArms,rightArms,30);
        RobotShooter shootered=new RobotShooter(firstHead,leftLegs,rightLegs,leftArms,rightArms,100);


        System.out.println(rpged.equals(shootered));














    }


}
