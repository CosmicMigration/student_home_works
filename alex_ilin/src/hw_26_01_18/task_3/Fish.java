package hw_26_01_18.task_3;

public class Fish {
   private String type;
   private int weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
