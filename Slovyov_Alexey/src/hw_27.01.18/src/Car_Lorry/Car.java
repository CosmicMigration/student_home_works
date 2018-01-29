package Car_Lorry;

public class Car {
    private String model;
    private double weight;
    private double power;

    public Car() {
    }

    public Car(String model, double weight, double power) {
        this.model = model;
        this.weight = weight;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
