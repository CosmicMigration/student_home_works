package AbstractRobot;

import java.util.Objects;

public class Robocop extends ARobot {

    private int speed;

//    public Robocop(int speed) {
//        this.speed = speed;
//    }

    public Robocop(String name, int numberOfEnergy, String superProperty, String head, String rightHand, String leftHand, String rightLeg, String leftLeg, String tors, int speed) {
        super(name, numberOfEnergy, superProperty, head, rightHand, leftHand, rightLeg, leftLeg, tors);
        this.speed = speed;
    }

    @Override
    public String iCanSpeek() {
        return "Я говорю как робот";
    }

    @Override
    public String iCanRun() {
        return "Я бегаю очень быстро";
    }

    @Override
    public String iCanWhrite() {
        return "Я пишу ножиком";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Robocop{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robocop robocop = (Robocop) o;
        return speed == robocop.speed;
    }

    @Override
    public int hashCode() {

        return Objects.hash(speed);
    }
}
