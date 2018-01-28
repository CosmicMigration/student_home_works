package hw_26_01_18.AppleSumsung_2;

public class Apple {
    private static float displaySize = 5.5F;
    private static boolean good = true;

    public static float getDisplaySize() {
        return displaySize;
    }

    public static void setDisplaySize(float displaySize) {
        Apple.displaySize = displaySize;
    }

    public static boolean isGood() {
        return good;
    }

    public static void setGood(boolean good) {
        Apple.good = good;
    }
}
