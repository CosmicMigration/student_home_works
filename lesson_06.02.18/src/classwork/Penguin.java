package classwork;

public class Penguin extends Birds implements CreateEggs {
    @Override
    public void sound() {
        System.out.println("Kaaaaaa");
    }

    @Override
    public void createEggs() {
        System.out.println("Big eggs");
    }
}
