package hw_09_02_18.Drinks;

import hw_09_02_18.Ingredients.Coffee;
import hw_09_02_18.Ingredients.Milk;
import hw_09_02_18.Ingredients.Sugar;
import hw_09_02_18.Ingredients.Water;

public class CoffeeWithMilk extends Drink{
    private Coffee coffee = new Coffee();
    private Water water = new Water();
    private Sugar sugar = new Sugar();
    private Milk milk = new Milk();

    public CoffeeWithMilk(double Water, double Coffee, double Sugar, double Milk) {
        setName("Coffee With Milk");
        water.setCount(Water);
        coffee.setCount(Coffee);
        sugar.setCount(Sugar);
        milk.setCount(Milk);
        setPrice(water.getPrice() + coffee.getPrice() + sugar.getPrice() + milk.getPrice());
    }
}
