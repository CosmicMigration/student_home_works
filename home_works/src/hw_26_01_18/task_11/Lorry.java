package hw_26_01_18.task_11;

public class Lorry extends Car {
    private double loadCapacity;

    public Lorry(String model, double weight, double power, double loadCapacity) {
        super(model, weight, power);
        this.loadCapacity = loadCapacity;
    }
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public void setModer(String s){
        super.model=s;
    }
}
