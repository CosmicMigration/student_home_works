package hw_09_02_18.Ingredients;

public class MilkFoam {
    private double count;
    private double price;

    public MilkFoam() {
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
        this.price = count*0.2;
    }

    public double getPrice() {
        return price;
    }

}
