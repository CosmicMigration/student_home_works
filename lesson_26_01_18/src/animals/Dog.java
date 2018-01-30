package animals;

public class Dog extends Animals {
    private String name;

    public Dog(){
        System.out.println("I am a dog constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
