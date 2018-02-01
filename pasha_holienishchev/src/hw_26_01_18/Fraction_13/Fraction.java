package Homeworks.Fraction_13;

public class Fraction {
    private int numerator;
    private int denominator;

    public void printFraction() {
        System.out.println("Your fraction: " + this.numerator + "/" + this.denominator);
    }

    public Fraction sumFraction(Fraction a) {
        Fraction sum = new Fraction();
        int nok = lcm(this.denominator, a.getDenominator());
        sum.setDenominator(nok);
        sum.setNumerator(nok / this.denominator * this.numerator + nok / a.getDenominator() * a.getNumerator());
        return sum;
    }

    public Fraction multFractionWithDouble(double a){
        Fraction B = doubleParsing(a);
        B.setNumerator(this.getNumerator()*B.getNumerator());
        B.setDenominator(this.getDenominator()*B.getDenominator());
        return B;
    }

    public Fraction divFractionWithDouble(double a){
        Fraction B = doubleParsing(a);
        int numerat = this.getNumerator()*B.getDenominator();
        int denomin = this.getDenominator()*B.getNumerator();
        B.setNumerator(numerat);
        B.setDenominator(denomin);
        return B;
    }

    private int gcd(int a, int b) { // НОД
        return b == 0 ? a : gcd(b, a % b);
    }

    private int lcm(int a, int b) { // НОК
        return a / gcd(a, b) * b;
    }

    private Fraction doubleParsing(double dA) { // Переводим double в десятичную дробь
        String str = (String.valueOf(dA));
        //
        int numbersAfterZero = (str.substring(str.indexOf('.'), str.length())).length() - 1;
        // Количество символов после нуля
        Fraction fractionA = new Fraction();
        double a = dA * Math.pow(10 , numbersAfterZero);
        fractionA.setNumerator((int) a);
        fractionA.setDenominator((int)Math.pow(10, numbersAfterZero));
        return fractionA;
    }

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
}
