package hw_09_02_18.Drinks;


import hw_09_02_18.Ingedients.Coffee;
import hw_09_02_18.Ingedients.Milk;
import hw_09_02_18.Ingedients.Sugar;
import hw_09_02_18.Ingedients.Water;

public class CoffeeWithMilk extends Drink{
    public CoffeeWithMilk() {
        setName("Coffee with milk");
        addComponent(new Coffee());
        addComponent(new Sugar());
        addComponent(new Water());
        addComponent(new Milk());
    }
}
