package Robots;

public class Robot {
    private Hand [] hands;
    private Leg [] legs;
    private Head head;
    private String name;

    public Robot() {
    }

    public Robot(Hand[] hands, Leg[] legs, Head head, String name) {
        this.hands = hands;
        this.legs = legs;
        this.head = head;
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public Leg[] getLegs() {
        return legs;
    }

    public Hand[] getHands() {
        return hands;
    }

    public boolean hasHead() {
        return getHead() != null;
    }

    public boolean hasTwoLegs() {
        return getLegs().length == 2;
    }

    public boolean hasTwoHands() {
        return getHands().length == 2;
    }

    public void isReady() {
        if (hasHead() && hasTwoHands() && hasTwoLegs()) {
            System.out.println("Robot is ready");
        }

        if (!hasHead()) {
            System.out.println("Robot can't speak");
        }

        if (!hasTwoHands()) {
            System.out.println("Robot can't write");
        }

        if (!hasTwoLegs()) {
            System.out.println("Robot can't walk");
        }
    }
}
