package hw_02_02_18;

public class Round extends Figure {
    public Round() {
    }

    public Round(int sideSize) {
        setName("Round");
        setSideCount(1);
        setSideSize(sideSize);
    }

    @Override
    public double area() {
        return Math.pow(getSideSize(),2)/(4*3.14);
    }
}
