package classwork;

public class Runner {
    public static void main(String[] args) {
//        Birds eagle = new Eagle();
//        Birds duck = new Duck();
//        Birds rubduck = new RubberDuck();
//
//        Birds[] arrBirds = new Birds[3];
//
//        arrBirds[0] = eagle;
//        arrBirds[1] = duck;
//        arrBirds[3] = rubduck;
//
//        for (Birds arrBird : arrBirds) {
//        }

        CreateEggs penguin = new Penguin();
        CreateEggs ducks = new Duck();

        CreateEggs[] mass = new CreateEggs[2];
        mass[0]= penguin;
        mass[1]=ducks;

        for (CreateEggs createEggs : mass) {
            createEggs.createEggs();
        }
    }
}
