package classwork;

public class Eagle extends Birds implements Fly,CreateEggs {


    @Override
    public void fly() {
        System.out.println("I can fly in the sky");
    }

    @Override
    public void sound() {
        System.out.println("EEEEE");
    }

    @Override
    public void createEggs() {

    }
}
