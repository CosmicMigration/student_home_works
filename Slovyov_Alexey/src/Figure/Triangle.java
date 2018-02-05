package Figure;

public class Triangle extends Figura {
    private double sideB=6;
    private double high=7;

    @Override
    public void paint() {
        System.out.println("Рисуем треугольник");
    }

    @Override
    public void calculateTheArea() {
        double d=0.5*(sideB*high);
        System.out.println("Площадь треугольника равна: "+d);
    }
}
