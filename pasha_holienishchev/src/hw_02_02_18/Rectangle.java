package hw_02_02_18;

public class Rectangle extends Figure {
    private int secondSide;
    public Rectangle() {
    }

    public Rectangle(int sideSize, int secondSide) {
        setName("hw_02_02_18.Rectangle");
        setSideCount(4);
        setSideSize(sideSize);
        this.secondSide = secondSide;
    }

    @Override
    public double area() {
        return getSideSize()*secondSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }
}
