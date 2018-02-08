package hw_06_02_18.classwork;

import hw_06_02_18.classwork.behavior.CreateEggs;
import hw_06_02_18.classwork.behavior.Fly;

public class Eagle extends Birds implements Fly,CreateEggs {


    @Override
    public String fly() {
        return " I can fly in the sky because amma eagle!! ";
    }

    @Override
    public String sound() {
        return " EEEE ";
    }

    @Override
    public String createEggs() {
        return " I'll kill for eggs ";
    }

    @Override
    public String toString() {
        return "Eagle - "+sound()+createEggs()+fly();
    }
}
