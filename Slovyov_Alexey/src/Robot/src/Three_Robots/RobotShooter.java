package Three_Robots;

import BodyParts.Arms;
import BodyParts.Head;
import BodyParts.Legs;
import BodyParts.Robot;

import java.util.Objects;

public class RobotShooter extends Robot{
    private int kalash;

    public RobotShooter(Head basicHead, Legs basicLegsLeft, Legs basicLegsRight, Arms basicArmsLeft, Arms basicArmsRight, int kalash) {
        super(basicHead, basicLegsLeft, basicLegsRight, basicArmsLeft, basicArmsRight);
        this.kalash = kalash;
    }

    public int getKalash() {
        return kalash;
    }

    public void setKalash(int kalash) {
        this.kalash = kalash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RobotShooter that = (RobotShooter) o;
        return kalash == that.kalash;
    }

    @Override
    public int hashCode() {

        return Objects.hash(kalash);
    }
}
