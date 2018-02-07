package hw_26_01_18.Car_11;

public class Lorry extends Car {
    private static float carryCapacity = 0F;

    private static void setModel(String string){
        Car.model = string;
    }

    public static String getModel() {
        return Car.model;
    }

    public static float getCarryCapacity() {
        return carryCapacity;
    }

    public static void setCarryCapacity(float carryCapacity) {
        Lorry.carryCapacity = carryCapacity;
    }
}
