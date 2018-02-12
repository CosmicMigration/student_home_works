package hw_09_02_18.Ingredients;

public class Milk {
    private double count;
    private double price;

    public Milk() {
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
        this.price = count * 0.3D;
    }

    public double getPrice() {
        return price;
    }

}
