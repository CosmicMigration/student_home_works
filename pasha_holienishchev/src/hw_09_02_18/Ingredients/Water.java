package hw_09_02_18.Ingredients;

public class Water {
    private double count;
    private double price;

    public Water() {
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.price = count * 0.005D;
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
