package classwork;

public class Duck extends Birds implements Fly,CreateEggs {
    @Override
    public void fly() {
        System.out.println("I am duck and I can fly");
    }

    @Override
    public void sound() {
        System.out.println("krya");
    }

    @Override
    public void createEggs() {
        System.out.println("little eggs");
    }
}
