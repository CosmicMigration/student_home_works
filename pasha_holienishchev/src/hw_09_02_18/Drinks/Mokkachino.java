package hw_09_02_18.Drinks;

import hw_09_02_18.Ingredients.HotChock;

public class Mokkachino extends CoffeeWithMilk {
    HotChock hotChock = new HotChock();

    public Mokkachino(double Water, double Coffee, double Sugar, double Milk, double Chockolate) {
        super(Water, Coffee, Sugar, Milk);
        hotChock.setCount(Chockolate);
        setName("Mokkachino");
        setPrice(getPrice() + hotChock.getPrice());
    }
}
