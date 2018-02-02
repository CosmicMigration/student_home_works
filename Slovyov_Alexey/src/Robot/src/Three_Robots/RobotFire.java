package Three_Robots;

import BodyParts.Arms;
import BodyParts.Head;
import BodyParts.Legs;
import BodyParts.Robot;

import java.util.Objects;

public class RobotFire extends Robot {
    private int fire;

    public RobotFire(Head basicHead, Legs basicLegsLeft, Legs basicLegsRight, Arms basicArmsLeft, Arms basicArmsRight, String nameOfRobot, int fire) {
        super(basicHead, basicLegsLeft, basicLegsRight, basicArmsLeft, basicArmsRight, nameOfRobot);
        this.fire = fire;
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RobotFire robotFire = (RobotFire) o;
        return fire == robotFire.fire;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), fire);
    }
}
