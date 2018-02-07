package hw_26_01_18.Chain_7;

public class Pet {
    private static boolean alive = true;
    private static int pawsCount = 4;

    public static boolean isAlive() {
        return alive;
    }

    public static void setAlive(boolean alive) {
        Pet.alive = alive;
    }

    public static int getPawsCount() {
        return pawsCount;
    }

    public static void setPawsCount(int pawsCount) {
        Pet.pawsCount = pawsCount;
    }
}
