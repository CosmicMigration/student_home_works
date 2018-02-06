package hw_for_robot.robot_hw;

import java.util.Objects;

public class LearnRobot extends Robot{
    private String learnParam;

    public LearnRobot(String learnParam) {
        this.learnParam = learnParam;
    }

    public String getLearnParam() {
        return learnParam;
    }

    public void setLearnParam(String learnParam) {
        this.learnParam = learnParam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LearnRobot that = (LearnRobot) o;
        return Objects.equals(learnParam, that.learnParam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), learnParam);
    }

    @Override
    public String toString() {
        return "LearnRobot{" +
                "learnParam='" + learnParam + '\'' +
                '}';
    }
}
