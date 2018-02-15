package hw_09_02_18;

import hw_09_02_18.Drinks.CoffeeStandart;
import hw_09_02_18.Drinks.CoffeeWithMilk;
import hw_09_02_18.Ingedients.Nuts;

public class Runner {
    public static void main(String[] args) {
        // Создаём кофе с молоком и выводим информацию
        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk();
        coffeeWithMilk.getDrinkInfo();

        // Создаём обычное кофе, добавляем орешки и выводим информацию
        CoffeeStandart coffeStandart = new CoffeeStandart();
        coffeStandart.addComponent(new Nuts());
        coffeStandart.getDrinkInfo();
    }
}
