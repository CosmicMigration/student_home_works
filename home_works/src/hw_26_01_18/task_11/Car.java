package hw_26_01_18.task_11;

public class Car {
    protected String model;
    private double weight;
    private double power;

    public Car(String model, double weight, double power) {
        this.model = model;
        this.weight = weight;
        this.power = power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}

