package animals;

public class AnimalsMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasia", "oval");
        Cat cat2 = new Cat("Vasia", "oval");
        Cat cat1 = new Cat("Iriskas", "triangle");

        System.out.println(cat == cat2);
        System.out.println(cat.equals(cat2));

        System.out.println("-------------------");

        System.out.println(cat == cat1);
        System.out.println(cat.equals(cat1));

    }
}
