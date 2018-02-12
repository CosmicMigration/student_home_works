package hw_09_02_18;

import hw_09_02_18.Drinks.BlackCoffee;
import hw_09_02_18.Drinks.Cappuccino;
import hw_09_02_18.Drinks.CoffeeWithMilk;

public class ShopRunner {
    public static void main(String[] args) {
        BlackCoffee blackCoffee = new BlackCoffee(100, 12, 20);
        CoffeeWithMilk coffeeWithMilk  = new CoffeeWithMilk(100, 10, 20, 20);
        Cappuccino cappuccino = new Cappuccino(100, 20, 20,20,20);

        System.out.println(coffeeWithMilk.getPrice());
        System.out.println(cappuccino.getPrice());
    }
}
