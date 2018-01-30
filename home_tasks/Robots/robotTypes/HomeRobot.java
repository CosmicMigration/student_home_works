package Robots.robotTypes;

import Robots.Hand;
import Robots.Head;
import Robots.Leg;
import Robots.Robot;

public class HomeRobot extends Robot {
    private boolean isClean;
    private boolean isCook;

    public HomeRobot(boolean isClean, boolean isCook) {
        this.isClean = isClean;
        this.isCook = isCook;
    }

    public HomeRobot(Hand[] hands, Leg[] legs, Head head, String name, boolean isClean, boolean isCook) {
        super(hands, legs, head, name);
        this.isClean = isClean;
        this.isCook = isCook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HomeRobot homeRobot = (HomeRobot) o;

        if (isClean != homeRobot.isClean) return false;
        return isCook == homeRobot.isCook;
    }

    @Override
    public int hashCode() {
        int result = (isClean ? 1 : 0);
        result = 31 * result + (isCook ? 1 : 0);
        return result;
    }
}
