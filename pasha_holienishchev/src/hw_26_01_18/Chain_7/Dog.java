package hw_26_01_18.Chain_7;

public class Dog extends Pet {
    private static float tongueLength = 10F;

    public static float getTongueLength() {
        return tongueLength;
    }

    public static void setTongueLength(float tongueLength) {
        Dog.tongueLength = tongueLength;
    }
}
