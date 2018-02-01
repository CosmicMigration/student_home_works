package Three_Robots;

import BodyParts.Arms;
import BodyParts.Head;
import BodyParts.Legs;
import BodyParts.Robot;

import java.util.Objects;

public class RobotRpg extends Robot {
    private int rpg;

    public RobotRpg(Head basicHead, Legs basicLegsLeft, Legs basicLegsRight, Arms basicArmsLeft, Arms basicArmsRight, int rpg) {
        super(basicHead, basicLegsLeft, basicLegsRight, basicArmsLeft, basicArmsRight);
        this.rpg = rpg;
    }

    public int getRpg() {
        return rpg;
    }

    public void setRpg(int rpg) {
        this.rpg = rpg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RobotRpg robotRpg = (RobotRpg) o;
        return rpg == robotRpg.rpg;
    }

    @Override
    public int hashCode() {

        return Objects.hash(rpg);
    }
}
