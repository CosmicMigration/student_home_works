package hw_26_01_18.task_3;

public class Ape extends Animals {
    private boolean hands;

    public boolean isHands() {
        return hands;
    }

    public void setHands(boolean hands) {
        this.hands = hands;
    }

    @Override
    public String toString() {
        return "Ape{" +
                "hands=" + hands +" /legs = "+isLegs()+" /weight = "+getWeight()+" /type = "+getType()+
                '}';
    }
}
