package animals;

public class AnimalsMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasia", "oval");
        Dog dog = new Dog("Vasia", "oval");



        System.out.println(cat.equals(dog));

        System.out.println(cat.hashCode());
        System.out.println(dog.hashCode());
    }
}
