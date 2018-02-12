package hw_09_02_18.Drinks;

import hw_09_02_18.Ingredients.Milk;


public class CoffeeWithMilk extends BlackCoffee{
    private Milk milk = new Milk();

    public CoffeeWithMilk(double Water, double Coffee, double Sugar, double Milk) {
        super(Water, Coffee, Sugar);
        setName("Coffee With Milk");
        milk.setCount(Milk);
        setPrice(getPrice()+milk.getPrice());
    }
}
