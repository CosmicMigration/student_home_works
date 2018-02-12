package hw_09_02_18.Drinks;

import hw_09_02_18.Ingredients.Coffee;
import hw_09_02_18.Ingredients.Sugar;
import hw_09_02_18.Ingredients.Water;

public class BlackCoffee extends Drink implements DrinkInfo {
    private Coffee coffee = new Coffee();
    private Water water = new Water();
    private Sugar sugar = new Sugar();

    public BlackCoffee(double Water, double Coffee, double Sugar) {
        setName("Black Coffee");
        water.setCount(Water);
        coffee.setCount(Coffee);
        sugar.setCount(Sugar);
        setPrice(water.getPrice() + coffee.getPrice() + sugar.getPrice());
    }

    @Override
    public void getDrinkInfo() {
        System.out.println();
    }
}
