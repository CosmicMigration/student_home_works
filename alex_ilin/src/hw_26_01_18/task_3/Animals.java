package hw_26_01_18.task_3;

public class Animals extends Fish {
    private boolean legs;

    public boolean isLegs() {
        return legs;
    }

    public void setLegs(boolean legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "legs=" + legs +" /type = "+getType()+" /weight= "+getWeight()+
                '}';
    }
}
