package hw_09_02_18.Ingredients;

import hw_09_02_18.Drinks.Drink;

public class Sugar extends Drink{
    private double count;
    private double price;

    public Sugar() {
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
        this.price = count * 0.1D;
    }

    public double getPrice() {
        return price;
    }

}
