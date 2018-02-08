package hw_06_02_18.classwork;

import hw_06_02_18.classwork.behavior.CreateEggs;
import hw_06_02_18.classwork.behavior.SpeakLikeHuman;

public class Parrot extends Birds implements CreateEggs,SpeakLikeHuman {
    @Override
    public String sound() {
        return " Amma Parrot, man & what about you? ";
    }

    @Override
    public String createEggs() {

        return " What is eggs? ";
    }

    @Override
    public String speakLikeHuman() {
        return " Вась Вась я Попугай ";
    }

    @Override
    public String toString() {
        return "Parrot - " + sound()+createEggs()+speakLikeHuman();
    }
}
