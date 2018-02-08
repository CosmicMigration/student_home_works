package hw_06_02_18.classwork;

import hw_06_02_18.classwork.behavior.CreateEggs;
import hw_06_02_18.classwork.behavior.RunLikeAntilope;

public class Ostrich extends Birds implements RunLikeAntilope, CreateEggs {
    @Override
    public String sound() {
        return " *Типа кричит как страус* ";
    }

    @Override
    public String running() {
        return " Я Страус! ";
    }

    @Override
    public String createEggs() {
        return " the biggest eggs ever ";
    }

    @Override
    public String toString() {
        return "Ostrich - "+sound()+createEggs()+running();
    }
}
