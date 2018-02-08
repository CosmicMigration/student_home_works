package ht10_06_02_18.Birds;

import ht10_06_02_18.Int.Fly;
import ht10_06_02_18.Int.SpeakLikeAMan;

public class Parrot extends Bird implements SpeakLikeAMan,Fly {
    @Override
    public void sound() {
        System.out.print(" Kesha horoshiy! ");
    }

    @Override
    public void speak() {
        System.out.print(" Kesha ochen horoshiy !");
    }

    @Override
    public void fly() {
        System.out.print(" I can fly ");
    }

}
