package hw_for_robot.robot_hw.robotPart;

public class Hand {

    private String typeHand;


    public String getTypeHand() {
        return typeHand;
    }

    public void setTypeHand(String typeHand) {
        this.typeHand = typeHand;
    }

    public Hand(String typeHand) {
        this.typeHand = typeHand;
    }

    public void robotCanWrite(){
        System.out.println("I am "+typeHand+". I can write.");
    }
}
