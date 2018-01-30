package hw_23_01_18.robot;

import hw_23_01_18.robot.Arm;
import hw_23_01_18.robot.Body;
import hw_23_01_18.robot.Head;
import hw_23_01_18.robot.Leg;

public class Robot {
    private Leg rightLeg = new Leg();
    private Leg leftLeg = new Leg();
    private Head mainHead = new Head();
    private Arm rightArm = new Arm();
    private Arm leftArm = new Arm();
    private Body mainBody = new Body();


    public Robot(Head mainHead, Leg rightLeg, Leg leftLeg, Arm rightArm, Arm leftArm, Body mainBody) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.mainBody = mainBody;
        System.out.println("Робот собран полностью.\n Может выполнять все свои функции:\n Говорить, писать, ходить");
    }

    public Robot(Leg rightLeg, Leg leftLeg, Arm rightArm, Arm leftArm, Body mainBody) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.mainBody = mainBody;
        System.out.println("Робот собран частично, у него нет головы,\n по этому от не может говорить");
    }

    public Robot(Head mainHead, Leg rightLeg, Leg leftLeg, Arm rightArm, Arm leftArm) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        System.out.println("Робот не может быть собран, так как у него нет тела");
    }

    public Robot(Head mainHead, Leg rightLeg, Arm rightArm, Arm leftArm, Body mainBody) {
        this.rightLeg = rightLeg;
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.mainBody = mainBody;
        System.out.println("Робот собран, но без левой ноги, он умеет говорить, писать, и ходить на правой ноге");
    }
    public Robot(Leg leftLeg,Head mainHead,  Arm rightArm, Arm leftArm, Body mainBody) {
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.mainBody = mainBody;
        System.out.println("Робот собран, но без правой ноги, он умеет говорить, писать, и ходить на левой ноге");
    }

    public Robot(Leg rightLeg, Leg leftLeg, Head mainHead, Arm leftArm, Body mainBody) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.leftArm = leftArm;
        this.mainBody = mainBody;
        System.out.println("Робот собран, но без правой руки, он может ходить, говорить и писать левой рукой");
    }
    public Robot(Head mainHead, Leg rightLeg, Leg leftLeg,  Arm rightArm, Body mainBody) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.mainBody = mainBody;
        System.out.println("Робот собран, но без левой руки, он может ходить, говорить и писать правой рукой");
    }

    public Robot(Leg rightLeg, Leg leftLeg, Head mainHead, Body mainBody) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.mainBody = mainBody;
        System.out.println("Робот собран без рук, он может ходить, говорить, но не может писать");
    }

    public Robot(Head mainHead, Arm rightArm, Arm leftArm, Body mainBody) {
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.mainBody = mainBody;
        System.out.println("Робот создан без ног, он может говорить, писать, но не может ходить.");
    }

}
