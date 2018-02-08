package Birds;

/**
 * Created by java on 06.02.2018.
 */
public class Runner {
    public static void main(String[] args) {

    Bird eagle=new Eagle("Eagle");
    Bird duck=new Duck("Black Duck");
    Bird rubDuck=new RubberDuck("Gumm Duck");
    Bird pingui=new Penguin("PiPingui");
    Bird ostri=new Ostrich("Straus");
    Bird parro=new Parrot("Kesha");

//        eagle.sound();
//        duck.sound();

        Bird [] birds=new Bird[6];
        birds[0]=eagle;
        birds[1]=duck;
        birds[2]=rubDuck;
        birds[3]=pingui;
        birds[4]=ostri;
        birds[5]=parro;

        System.out.println("Птицы кричат!!!");
        for (Bird bird : birds) {
            System.out.println("Имя птицы  "+bird.getName()+"  ее боевой клич");
            bird.sound();
            if(bird instanceof Fly){
                ((Fly) bird).fly();
            }
            if(bird instanceof CreateEggs){
                ((CreateEggs)bird).createEggs();
            }
            if(bird instanceof RunAsatilope){
                ((RunAsatilope)bird).runAsAntil();
            }
            if(bird instanceof SpeekAsHuman){
                ((SpeekAsHuman)bird).speekAsHum();
            }




        }

        System.out.println("-----------------------------------------");
        //интерфейс задает поведение
        CreateEggs pinguin=new Penguin("pppppp");//имплеиентирубт поведение откладывать яйца
        CreateEggs ducks=new Duck("DDDDDDD");
       // CreateEggs eag=new Eagle();//интерфейса нести яйцау орла нет

        CreateEggs[]mass=new CreateEggs[2];
        mass[0]=pinguin;
        mass[1]=ducks;

        for(CreateEggs mas:mass){
            mas.createEggs();
        }






    }




}
