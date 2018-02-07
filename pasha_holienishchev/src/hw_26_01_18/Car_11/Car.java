package hw_26_01_18.Car_11;

public class Car {
    protected static String model;
    protected static float weight = 0F;
    protected static int power = 0;

    public static int getPower() {
        return power;
    }

    public static void setPower(int power) {
        Car.power = power;
    }
}
