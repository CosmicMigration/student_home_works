package hw_09_02_18.Drinks;

import hw_09_02_18.Ingredients.MilkFoam;

public class Cappuccino extends CoffeeWithMilk {
    private MilkFoam milkFoam = new MilkFoam();

    public Cappuccino(double Water, double Coffee, double Sugar, double Milk, double MilkFoam) {
        super(Water, Coffee, Sugar, Milk);
        setName("Cappuccino");
        milkFoam.setCount(MilkFoam);
        setPrice(getPrice()+milkFoam.getPrice());
    }
}
