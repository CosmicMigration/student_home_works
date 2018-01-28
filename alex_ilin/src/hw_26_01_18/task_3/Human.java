package hw_26_01_18.task_3;

public class Human extends Ape {
    private boolean mind;

    public boolean isMind() {
        return mind;
    }

    public void setMind(boolean mind) {
        this.mind = mind;
    }

    @Override
    public String toString() {
        return "Human{" +
                "mind = " + mind +"hands = " + isHands() +" /legs = "+isLegs()+" /weight = "+getWeight()+" /type = "+getType()+
                '}';
    }
}
