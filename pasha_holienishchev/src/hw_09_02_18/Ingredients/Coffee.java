package hw_09_02_18.Ingredients;

public class Coffee {
    private double count;
    private double price;

    public Coffee() {
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
        this.price = count * 0.7D;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
