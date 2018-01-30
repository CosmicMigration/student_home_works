package hw_26_01_18.task_11;

public class Car {
    private String mark;
    private int weight;
    private int power;

    public Car() {
    }

    public Car(String mark, int weight, int power) {
        this.mark = mark;
        this.weight = weight;
        this.power = power;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
