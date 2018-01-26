import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private String name;
    private int age;
    private String lang;

    public Student() {
        this.name = getRandomName();
        this.age = getRandomAge();
    }

    public Student(String lang) {
        this.name = getRandomName();
        this.age = getRandomAge();
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLang() {
        return lang;
    }

    private static String getRandomName() {
        String [] names = {"Nastya", "Oleg", "Maxim", "Fiona", "Chris", "Inga", "Kamila", "Julia", "Torsten", "Nick", "Emily"};

        return names[new Random().nextInt(names.length)];
    }

    private static int getRandomAge() {
        int randomNum = ThreadLocalRandom.current().nextInt(7, 16 + 1) ;
        return  randomNum;
    }

}
