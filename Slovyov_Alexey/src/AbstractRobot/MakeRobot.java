package AbstractRobot;

public class MakeRobot {
    public static void main(String[] args) {


        ARobot[] robo=new ARobot[3];

      robo[0]=new Transformer("Transformer",100,"Kills other robots","Kabina","RH","LH","RL","LL","BodySteel",10);
      robo[1]=new RobotCipa("Cipa",200,"Fire","Cirle","RukaRight","RukaLeft","NogaRight","NogaLeft","Bronya","eagle F1");
      robo[2]=new Robocop("Alex",300,"Fly","Kaska","Right Steel Leg","Left Steel Leg","Right Steel Leg","Left Steel Leg","Steel Tors",160);

      for(ARobot i:robo){
          System.out.println(i.getName()+"  ,   "+i.iCanRun()+" , "+i.iCanSpeek()+" , "+i.iCanWhrite()+" , "+i.getSuperProperty());

      }



















    }
}
