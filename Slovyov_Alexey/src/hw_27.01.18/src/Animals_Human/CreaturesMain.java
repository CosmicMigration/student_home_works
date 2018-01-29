package Animals_Human;

public class CreaturesMain {

    public static void main(String[] args) {
        Human human = new Human();
        human.setKind("human");
        human.setBreatheUnderWater(false);
        human.breatheO2();
        human.setFood("Animals");
        human.setNumberOfLegs(2);
        human.setTail(false);
        human.setWeight(80);
        human.setSex("man");
        human.setNationality("Ukrainian");


        System.out.println("Вид :" + human.getKind() + "дышит: " + human.isBreatheUnderWater() +
                "тип еды: " + human.getFood() + " колличество ног: " + human.getNumberOfLegs() + " наличие хвоста: " +
                human.isTail() + " вес = " + human.getWeight() + " пол: " + human.getSex() + " национальность: " +
                human.getNationality());


    }

}
