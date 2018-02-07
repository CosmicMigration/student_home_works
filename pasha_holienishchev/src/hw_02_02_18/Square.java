package hw_02_02_18;

public class Square extends Figure{
    public Square() {
        setName("hw_02_02_18.Square");
        setSideCount(4);
    }
    public Square(int sideSize){
        setName("hw_02_02_18.Square");
        setSideCount(4);
        setSideSize(sideSize);
    }

    @Override
    public double area() {
        return Math.pow(getSideSize(), 2);
    }
}
