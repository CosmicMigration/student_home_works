package Figure;

public class Square extends Figura {

    private double side=2;

    @Override
    public void paint() {
        System.out.println("Рисуем квадрат");
    }

    @Override
    public void calculateTheArea() {
        double s=side*side;
        System.out.println("Площадь квадрата равна: "+s);
    }
}
