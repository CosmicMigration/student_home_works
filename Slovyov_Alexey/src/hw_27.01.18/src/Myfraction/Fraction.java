package Myfraction;

public class Fraction {
    private int numerator;//числитель
    private int denominator;//знаменатель

    //как то странно работает(((

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return Integer.toString(numerator) + "/" + Integer.toString(denominator);
    }

    public String multiplication(double s) {
        double multi = ((int) numerator / (int) denominator) * s;
        return Double.toString(multi);
    }

    public String division(double s) {
        double div = ((int) numerator / (int) denominator) / s;
        return Double.toString(div);
    }

}
