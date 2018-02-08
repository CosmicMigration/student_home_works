package hw_06_02_18.classwork;

import hw_06_02_18.classwork.behavior.CreateEggs;
import hw_06_02_18.classwork.behavior.RunLikeAntilope;
import hw_06_02_18.classwork.behavior.SpeakLikeHuman;

public class Runner {
    public static void main(String[] args) {
        Birds eagle = new Eagle();
        Birds eagle2 = new Eagle();

        Birds duck = new Duck();
        Birds duck2 = new Duck();

        Birds rubduck = new RubberDuck();
        Birds rubduck2 = new RubberDuck();

        Birds ostrich = new Ostrich();
        Birds ostrich2 = new Ostrich();

        Birds penguin = new Penguin();
        Birds penguin2 = new Penguin();

        Birds parrot = new Parrot();
        Birds parrot2 = new Parrot();

        Birds[] allBirds = new Birds[12];
        allBirds[0]=eagle;
        allBirds[1]=eagle2;
        allBirds[2]=duck;
        allBirds[3]=duck2;
        allBirds[4]=rubduck;
        allBirds[5]=rubduck2;
        allBirds[6]=ostrich;
        allBirds[7]=ostrich2;
        allBirds[8]=parrot;
        allBirds[9]=parrot2;
        allBirds[10]=penguin;
        allBirds[11]=penguin2;
        System.out.println("1я группа, к-я несет яйца");
        for (Birds bird : allBirds) {
            if(bird instanceof CreateEggs){
                System.out.println(bird.toString());
            }
        }
        System.out.println("\n2-я группа - звучат что надо");
        for (Birds bird : allBirds) {
            if(bird instanceof Birds){
                System.out.println(bird.sound());
            }
        }
        System.out.println("\n3-я группа - попугайчики");

        for (Birds bird : allBirds) {
            if(bird instanceof SpeakLikeHuman){
                System.out.println(bird.toString());
            }

        }
        System.out.println("\n4-я группа - бегают как угорелые");

        for (Birds bird : allBirds) {
            if(bird instanceof RunLikeAntilope){
                System.out.println(bird.toString());
            }
        }

    }
}
