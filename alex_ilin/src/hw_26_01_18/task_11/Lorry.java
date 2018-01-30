package hw_26_01_18.task_11;

public class Lorry extends Car {
    private int tonnage;

    public Lorry() {
    }

    public Lorry(String mark, int weight, int power, int tonnage) {
        super(mark, weight, power);
        this.tonnage = tonnage;
    }

    public Lorry(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

}
