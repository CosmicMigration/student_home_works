package hw_02_02_18.Figures;

//Todo пересмотреть эту задачу,использовать абстрактные методы.
public class FigureRunner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 6);
        rect1.canPaint();
        System.out.println("His area: " + rect1.area());
        Round round1 = new Round(10);
        round1.canPaint();
        System.out.println("His area: " + round1.area());
        Square square1 = new Square(4);
        square1.canPaint();
        System.out.println("His area: " + square1.area());
        Triangle triangle1 = new Triangle(5);
        triangle1.canPaint();
        System.out.println("His area: " + triangle1.area());
    }
}
