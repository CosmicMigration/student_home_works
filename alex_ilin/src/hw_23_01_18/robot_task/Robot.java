package hw_23_01_18.robot_task;

public class Robot {
    private Leg rightLeg = new Leg();
    private Leg leftLeg = new Leg();
    private Head mainHead = new Head();
    private Arm rightArm = new Arm();
    private Arm leftArm = new Arm();
    private Body corpus= new Body();

    public Robot() {
        System.out.println("Нам бы робота создать");
    }

    public Robot(Head mainHead, Leg rightLeg, Leg leftLeg, Arm rightArm, Arm leftArm, Body corpus) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.corpus = corpus;
        System.out.println("Робот цел и полностью готов к работе.\n Он может писать обеими руками и полноценно ходить и разговаривать");
    }

    public Robot(Leg rightLeg, Leg leftLeg, Arm rightArm, Arm leftArm, Body corpus) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.corpus = corpus;
        System.out.println("Робот почти готов, умеет писать и ходить, но... голову-то забыли!!");
    }

    public Robot(Head mainHead, Leg rightLeg, Leg leftLeg, Arm rightArm, Arm leftArm) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        System.out.println("Чудно, у робота есть все: руки-ноги, голова. Да вот только привинтить это все некуда. Тело забыли");
    }

    public Robot(Head mainHead, Leg rightLeg, Arm rightArm, Arm leftArm, Body corpus) {
        this.rightLeg = rightLeg;
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.corpus = corpus;
        System.out.println("Робот готов, но он будет шкандыбать только на правой ноге. Умеет писать, говорить... и хромать");
    }
    public Robot(Leg leftLeg,Head mainHead,  Arm rightArm, Arm leftArm, Body corpus) {
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.corpus = corpus;
        System.out.println("Робот готов, но он будет шкандыбать только на левой ноге. Умеет писать, говорить... и хромать");
    }

    public Robot(Leg rightLeg, Leg leftLeg, Head mainHead, Arm leftArm, Body corpus) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.leftArm = leftArm;
        this.corpus = corpus;
        System.out.println("Роботу не хватает правой руки, может ходить говорить и писать левой рукой");
    }
    public Robot(Head mainHead, Leg rightLeg, Leg leftLeg,  Arm rightArm, Body corpus) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.corpus = corpus;
        System.out.println("Роботу не хватает левой руки, может ходить говорить и писать правой рукой");
    }

    public Robot(Leg rightLeg, Leg leftLeg, Head mainHead, Body corpus) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.mainHead = mainHead;
        this.corpus = corpus;
        System.out.println("Робот без рук, соответственно он умеет только говорить и ходить, писать придется вместо него\n ну или руки создать");
    }

    public Robot(Head mainHead, Arm rightArm, Arm leftArm, Body corpus) {
        this.mainHead = mainHead;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.corpus = corpus;
        System.out.println("Робот без ног? Джарвиса собираем? Умеет писать и говорить.");
    }

    public Robot(Leg rightLeg, Leg leftLeg, Arm rightArm, Arm leftArm) {
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        System.out.println("Руки-ноги есть, но нет ни головы ни туловища. Можно сделать из этого бегающие руки, ну или пишущие ноги");
    }

    public Robot(Body corpus) {
        this.corpus = corpus;
        System.out.println("Да. Каркас есть, теперь нужно все остально нацепить на туловище");
    }
}
