package Homeworks.Fraction_13;

public class MainFraction {
    public static void main(String[] args) {
        Fraction a = new Fraction(1, 4);
        // Сумма
        Fraction b = new Fraction(1, 3);
        Fraction sum = a.sumFraction(b);
        sum.printFraction();
        // Умножение на double
        Fraction mult = a.multFractionWithDouble(1.2D);
        mult.printFraction();
        // Деление на double
        Fraction div = a.divFractionWithDouble(0.25);
        div.printFraction();
    }
}