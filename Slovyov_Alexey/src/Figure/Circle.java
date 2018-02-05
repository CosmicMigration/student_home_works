package Figure;

public class Circle extends Figura {


    private double radius=5;
    private final double pi=3.14;





    @Override
    public void paint() {
        System.out.println("Рисуем круг");
    }

    @Override
    public void calculateTheArea() {
        double sC=pi*(radius*radius);
        System.out.println("Площадь круга равна:"+sC);


    }
}
