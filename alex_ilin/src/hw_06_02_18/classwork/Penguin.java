package hw_06_02_18.classwork;

import hw_06_02_18.classwork.behavior.CreateEggs;

public class Penguin extends Birds implements CreateEggs {
    @Override
    public String sound() {
        return " *Орут по пингвиньи* ";
    }

    @Override
    public String createEggs() {
        return " Big eggs ";
    }

    @Override
    public String toString() {
        return "Penguin - " + sound()+createEggs();
    }
}
