package hw_for_robot.robot_hw;

import java.util.Objects;

public class SuperRobot extends Robot {
    private String superParam;

    public SuperRobot(String superParam) {
        this.superParam = superParam;
    }

    public String getSuperParam() {
        return superParam;
    }

    public void setSuperParam(String superParam) {
        this.superParam = superParam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SuperRobot that = (SuperRobot) o;
        return Objects.equals(superParam, that.superParam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), superParam);
    }

    @Override
    public String toString() {
        return "SuperRobot{" +
                "superParam='" + superParam + '\'' +
                '}';
    }
}
