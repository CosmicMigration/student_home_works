package hw_09_02_18.Drinks;


import hw_09_02_18.Ingedients.Coffee;
import hw_09_02_18.Ingedients.Sugar;
import hw_09_02_18.Ingedients.Water;

public class CoffeeStandart extends Drink{
    public CoffeeStandart() {
        setName("Standart Coffee");
        addComponent(new Water());
        addComponent(new Coffee());
        addComponent(new Sugar());
    }
}
