package AbstractRobot;

import java.util.Objects;

public class Transformer extends ARobot {

    private int numberOfLife;// кол-во жизней

    public Transformer(int numberOfLife) {
        this.numberOfLife = numberOfLife;
    }

    public Transformer(String name, int numberOfEnergy, String superProperty, String head, String rightHand, String leftHand, String rightLeg, String leftLeg, String tors, int numberOfLife) {
        super(name, numberOfEnergy, superProperty, head, rightHand, leftHand, rightLeg, leftLeg, tors);
        this.numberOfLife = numberOfLife;

    }

    @Override
    public String iCanSpeek() {
        return "Я могу только свистеть";
    }

    @Override
    public String iCanRun() {
        return "Я бегаю очень быстро";
    }

    @Override
    public String iCanWhrite() {
        return "Я могу писать стихи";
    }

    public int getNumberOfLife() {
        return numberOfLife;
    }

    public void setNumberOfLife(int numberOfLife) {
        this.numberOfLife = numberOfLife;
    }

    @Override
    public String toString() {
        return "Transformer{" +
                "numberOfLife=" + numberOfLife +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transformer that = (Transformer) o;
        return numberOfLife == that.numberOfLife;
    }

    @Override
    public int hashCode() {

        return Objects.hash(numberOfLife);
    }
}
