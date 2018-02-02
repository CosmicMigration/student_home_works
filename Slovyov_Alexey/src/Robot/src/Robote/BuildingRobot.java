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

        RobotFire fired=new RobotFire(firstHead,leftLegs,rightLegs,leftArms,rightArms,"Gosha",34);
        RobotFire fired1=new RobotFire(firstHead,leftLegs,rightLegs,leftArms,rightArms,"Misha",36);

        RobotRpg rpged=new RobotRpg(firstHead,leftLegs,rightLegs,leftArms,rightArms,"Bazuka",50);
        RobotRpg rpged1=new RobotRpg(firstHead,leftLegs,rightLegs,leftArms,rightArms,"PTUR",60);

        RobotShooter shootered=new RobotShooter(firstHead,leftLegs,rightLegs,leftArms,rightArms,"Strelok",80);
        RobotShooter shootered1=new RobotShooter(firstHead,leftLegs,rightLegs,leftArms,rightArms,"Snayper",85);


        System.out.println("---------------------------------------------------");

        System.out.println(fired);
        System.out.println(fired==fired1);// ???
        System.out.println(fired.equals(fired1));

        System.out.println(fired.hashCode());
        System.out.println(rpged.hashCode());
        System.out.println(shootered.hashCode());

        System.out.println("--------------------------------------------------------");
        Robot[] robMass=new Robot[6];
        robMass[0]=fired;
        robMass[1]=fired1;
        robMass[2]=rpged;
        robMass[3]=rpged1;
        robMass[4]=shootered;
        robMass[5]=shootered1;

        for(int i=0;i<robMass.length;i++){
            System.out.println(robMass[i].hashCode());//hashcode
        }

        for(int i=0;i<robMass.length;i++){
            System.out.println(robMass[i].getNameOfRobot()+"    "+robMass[i].getClass());
        }

        System.out.println("--------------------------------------------------------------");

        int [] robHassMass=new int[6];

        robHassMass[0]=fired.hashCode();
        robHassMass[1]=fired1.hashCode();
        robHassMass[2]=rpged.hashCode();
        robHassMass[3]=rpged1.hashCode();
        robHassMass[4]=shootered.hashCode();
        robHassMass[5]=shootered1.hashCode();

        for(int i=0;i<robHassMass.length;i++){

            System.out.println(robHassMass[i]);
        }

        for(int i=0;i<robHassMass.length;i++){
            if(robHassMass[i]==fired.hashCode()){
                fired.
            }
        }

























    }


}
