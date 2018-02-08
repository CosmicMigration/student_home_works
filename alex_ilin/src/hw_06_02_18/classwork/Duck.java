package hw_06_02_18.classwork;

import hw_06_02_18.classwork.behavior.CreateEggs;
import hw_06_02_18.classwork.behavior.Fly;

public class Duck extends Birds implements Fly,CreateEggs {
    @Override
    public String fly() {
        return " I am duck and I can fly ";
    }

    @Override
    public String sound() {
        return " krya ";
    }

    @Override
    public String createEggs() {
        return " little eggs ";
    }

    @Override
    public String toString() {
        return "Duck - "+sound()+createEggs()+fly();
    }
}
