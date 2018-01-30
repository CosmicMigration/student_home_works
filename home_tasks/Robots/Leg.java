package Robots;

public class Leg {
    private boolean isWalking;
    private int countLegs;

    public Leg() {
    }

    public Leg(boolean isWalking) {
        this.isWalking = isWalking;
    }

    public Leg(boolean isWalking, int countLegs) {
        this.isWalking = isWalking;
        this.countLegs = countLegs;
    }

    public boolean isWalking() {
        return isWalking;
    }

    public void setWalking(boolean walking) {
        isWalking = walking;
    }

    public int getCountLegs() {
        return countLegs;
    }
}
