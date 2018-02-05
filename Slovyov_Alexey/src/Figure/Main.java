package Figure;

public class Main {
    public static void main(String[] args) {
        Square square=new Square();
        square.paint();
        square.calculateTheArea();

        System.out.println("--------------------------");

        Rectangle rect=new Rectangle();
        rect.paint();
        rect.calculateTheArea();

        System.out.println("--------------------------");
        Triangle triag= new Triangle();
        triag.paint();
        triag.calculateTheArea();

        System.out.println("--------------------------");

        Circle circle=new Circle();
        circle.paint();
        circle.calculateTheArea();


    }
}
