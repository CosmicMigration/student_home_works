package hw_26_01_18.Chain_7;

public class Cat extends Pet {
    private static boolean mustache = true;

    public static boolean isMustache() {
        return mustache;
    }

    public static void setMustache(boolean mustache) {
        Cat.mustache = mustache;
    }
}
