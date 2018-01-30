package hw_23_01_18;

import hw_23_01_18.robot.*;

public class MainRobot {
    public static void main(String[] args) {
        robot();   
    }
        public static void robot(){
            Leg leg = new Leg();
            Head head = new Head();
            Arm arm = new Arm();
            Body body= new Body();

            leg.joinLeg();
            head.joinHead();
            arm.joinArm();
            body.joinBody();

            int option = 1;
            switch (option) {
                case 1:
                    System.out.println("\nВыполняется сборка робота...\n");
                    Robot Option1 = new Robot(head, leg, leg, arm, arm, body);
                    break;
                case 2:
                    System.out.println("\nВыполняется сборка робота...\n");
                    Robot Option2 = new Robot(head,  leg, arm, arm, body);
                    break;
                case 3:
                    System.out.println("\nВыполняется сборка робота...\n");
                    Robot Option3 = new Robot(leg, head, arm, arm, body);
                    break;
                case 4:
                    System.out.println("\nВыполняется сборка робота...\n");
                    Robot Option4 = new Robot(leg, leg, arm, arm, body);
                    break;
                case 5:
                    System.out.println("\nВыполняется сборка робота...\n");
                    Robot Option5 = new Robot(head, leg, leg, arm, body);
                    break;
                case 6:
                    System.out.println("\nВыполняется сборка робота...\n");
                    Robot Option6 = new Robot(head, leg, leg, arm, arm);
                    break;
                case 7:
                    System.out.println("\nВыполняется сборка робота...\n");
                    Robot Option7 = new Robot(leg, leg, head, body);
                    break;
                case 8:
                    System.out.println("\nВыполняется сборка робота...\n");
                    Robot Option8 = new Robot(head, arm, arm, body);
                    break;
                case 9:
                    System.out.println("\nВыполняется сборка робота...\n");
                    Robot Option9 = new Robot( leg, leg, head, arm, body);
                    break;
                default:
                    System.out.println("Выберите вариант сборки робота от 1 до 9");

            }
        }
    }


