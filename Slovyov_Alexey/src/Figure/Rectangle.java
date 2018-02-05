package Figure;

public class Rectangle extends Figura {

    private double sideA=2;
    private double sideB=8;

    @Override
    public void paint() {
        System.out.println("Рисуем прямоугольник");
    }

    @Override
    public void calculateTheArea() {
        double p=sideA*sideB;
        System.out.println("Площадь прямоуголника равна:"+p);
    }
}
