package Robot;

public class Body {

    private Head head;
    private Hands handL;
    private Hands handR;
    private Legs legL;
    private Legs legR;

    public Body(Head head, Hands handL, Hands handR, Legs legL, Legs legR) {
        this.head = head;
        this.handL = handL;
        this.handR = handR;
        this.legL = legL;
        this.legR = legR;
        System.out.println("The robot is ready!");
        head.talk();
        legL.walk();
        handL.write();
    }

    public Body(Head head, Hands handL, Hands handR, Legs legL) {
        this.head = head;
        this.handL = handL;
        this.handR = handR;
        this.legL = legL;
        System.out.println("I need rework!");
        legL.jump();
    }

    public Body(Head head, Hands handL, Legs legL, Legs legR) {
        this.head = head;
        this.handL = handL;
        this.legL = legL;
        this.legR = legR;
        System.out.println("I need rework!");
        handL.oneHand();
    }

    public Body(Hands handL, Hands handR, Legs legL, Legs legR) {
        this.handL = handL;
        this.handR = handR;
        this.legL = legL;
        this.legR = legR;
        System.out.println("I need rework!");
        System.out.println("I can't talk!");
    }

}
