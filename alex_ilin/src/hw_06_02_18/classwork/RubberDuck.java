package hw_06_02_18.classwork;

public class RubberDuck extends Birds {


    @Override
    public String sound() {
        return "wack-wack";
    }

    @Override
    public String toString() {
        return "RubberDuck - "+sound();
    }
}
