package hw_02_02_18;

public class Triangle extends Figure{
    public Triangle() {
        setName("Triangle");
        setSideCount(3);
    }

    public Triangle(int sideSize) {
        setName("hw_02_02_18.Triangle");
        setSideCount(3);
        setSideSize(sideSize);
    }

    @Override
    public double area() {
        return getSideSize()*Math.pow(3, 0.5)/4;
    }
}
