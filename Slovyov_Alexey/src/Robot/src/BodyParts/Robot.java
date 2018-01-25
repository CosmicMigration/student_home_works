package BodyParts;

public class Robot {
    private Head basicHead;
    private Legs basicLegsLeft;
    private Legs basicLegsRight;
    private Arms basicArmsLeft;
    private Arms basicArmsRight;

    public Robot() {
    }

    public Robot(Head basicHead, Legs basicLegsLeft, Legs basicLegsRight, Arms basicArmsLeft, Arms basicArmsRight) {
        this.basicHead = basicHead;
        this.basicLegsLeft = basicLegsLeft;
        this.basicLegsRight = basicLegsRight;
        this.basicArmsLeft = basicArmsLeft;
        this.basicArmsRight = basicArmsRight;
        System.out.println("Робот собран");
    }

    public Robot(Head basicHead, Legs basicLegsLeft, Legs basicLegsRight, Arms basicArmsLeft) {
        this.basicHead = basicHead;
        this.basicLegsLeft = basicLegsLeft;
        this.basicLegsRight = basicLegsRight;
        this.basicArmsLeft = basicArmsLeft;
        System.out.println("Могу писать только одной рукой");
    }

    public Robot(Head basicHead, Legs basicLegsRight, Arms basicArmsLeft, Arms basicArmsRight) {
        this.basicHead = basicHead;
        this.basicLegsRight = basicLegsRight;
        this.basicArmsLeft = basicArmsLeft;
        this.basicArmsRight = basicArmsRight;
        System.out.println("Могу только прыгать на одной ноге");
    }

    public Robot(Legs basicLegsLeft, Legs basicLegsRight, Arms basicArmsLeft, Arms basicArmsRight) {
        this.basicLegsLeft = basicLegsLeft;
        this.basicLegsRight = basicLegsRight;
        this.basicArmsLeft = basicArmsLeft;
        this.basicArmsRight = basicArmsRight;
        System.out.println("НЕ могу говорить");
    }

    public Head getBasicHead() {
        return basicHead;
    }

    public void setBasicHead(Head basicHead) {
        this.basicHead = basicHead;
    }

    public Legs getBasicLegsLeft() {
        return basicLegsLeft;
    }

    public void setBasicLegsLeft(Legs basicLegsLeft) {
        this.basicLegsLeft = basicLegsLeft;
    }

    public Legs getBasicLegsRight() {
        return basicLegsRight;
    }

    public void setBasicLegsRight(Legs basicLegsRight) {
        this.basicLegsRight = basicLegsRight;
    }

    public Arms getBasicArmsLeft() {
        return basicArmsLeft;
    }

    public void setBasicArmsLeft(Arms basicArmsLeft) {
        this.basicArmsLeft = basicArmsLeft;
    }

    public Arms getBasicArmsRight() {
        return basicArmsRight;
    }

    public void setBasicArmsRight(Arms basicArmsRight) {
        this.basicArmsRight = basicArmsRight;
    }
}
