package AbstractRobot;

public abstract class ARobot {

    public abstract String iCanSpeek();
    public abstract String iCanRun();
    public abstract String iCanWhrite();

    private String name;
    private int numberOfEnergy;
    private String superProperty;
    private String head;
    private String rightHand;
    private String leftHand;
    private String rightLeg;
    private String leftLeg;
    private String tors;


    public ARobot() {
    }

    public ARobot(String name, int numberOfEnergy, String superProperty, String head, String rightHand, String leftHand, String rightLeg, String leftLeg, String tors) {
        this.name = name;
        this.numberOfEnergy = numberOfEnergy;
        this.superProperty = superProperty;
        this.head = head;
        this.rightHand = rightHand;
        this.leftHand = leftHand;
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.tors = tors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEnergy() {
        return numberOfEnergy;
    }

    public void setNumberOfEnergy(int numberOfEnergy) {
        this.numberOfEnergy = numberOfEnergy;
    }

    public String getSuperProperty() {
        return superProperty;
    }

    public void setSuperProperty(String superProperty) {
        this.superProperty = superProperty;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getRightHand() {
        return rightHand;
    }

    public void setRightHand(String rightHand) {
        this.rightHand = rightHand;
    }

    public String getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(String leftHand) {
        this.leftHand = leftHand;
    }

    public String getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(String rightLeg) {
        this.rightLeg = rightLeg;
    }

    public String getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(String leftLeg) {
        this.leftLeg = leftLeg;
    }

    public String getTors() {
        return tors;
    }

    public void setTors(String tors) {
        this.tors = tors;
    }
}
