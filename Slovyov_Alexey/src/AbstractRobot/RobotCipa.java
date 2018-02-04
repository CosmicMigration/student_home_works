package AbstractRobot;

import java.util.Objects;

public class RobotCipa extends ARobot {
    private String gunMashine;// super пушка

//    public RobotCipa(String gunMashine) {
//        this.gunMashine = gunMashine;
//    }

    public RobotCipa(String name, int numberOfEnergy, String superProperty, String head, String rightHand, String leftHand, String rightLeg, String leftLeg, String tors, String gunMashine) {
        super(name, numberOfEnergy, superProperty, head, rightHand, leftHand, rightLeg, leftLeg, tors);
        this.gunMashine = gunMashine;
    }

    @Override
    public String iCanSpeek() {
        return "Я только пищу";
    }

    @Override
    public String iCanRun() {
        return "Я бегаю как кенгуру";
    }

    @Override
    public String iCanWhrite() {
        return "Пишу как курица";
    }

    public String getGunMashine() {
        return gunMashine;
    }

    public void setGunMashine(String gunMashine) {
        this.gunMashine = gunMashine;
    }

    @Override
    public String toString() {
        return "RobotCipa{" +
                "gunMashine='" + gunMashine + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RobotCipa robotCipa = (RobotCipa) o;
        return Objects.equals(gunMashine, robotCipa.gunMashine);
    }

    @Override
    public int hashCode() {

        return Objects.hash(gunMashine);
    }
}
