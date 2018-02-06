package hw_for_robot.robot_hw.robotPart;

public class Leg {

    private String typeLeg;

    public String getTypeLeg() {
        return typeLeg;
    }

    public void setTypeLeg(String typeLeg) {
        this.typeLeg = typeLeg;
    }

    public Leg(String typeLeg) {
        this.typeLeg = typeLeg;
    }

    public void robotCanRun(){
        System.out.println("I am "+typeLeg+". I can run.");
    }
}
