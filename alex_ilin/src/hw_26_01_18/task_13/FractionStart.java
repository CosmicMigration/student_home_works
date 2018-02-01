package hw_26_01_18.task_13;

public class FractionStart {
    public static void main(String[] args) {
        program();

    }
    public static void program(){
        Fraction fraction = new Fraction();
        Fraction fraction2 = new Fraction();

        System.out.println(fraction.toString());
        System.out.println(fraction2.toString());

        System.out.println("---------------------------------");
        System.out.println("Сложение");
        System.out.println(addition(fraction, fraction2).toString());
        System.out.println("Умножение");
        System.out.println(multiplication(fraction, fraction2).toString());
        System.out.println("Деление");
        System.out.println(devision(fraction, fraction2).toString());

    }
    public static Fraction addition(Fraction frac1, Fraction frac2){
        Fraction result = new Fraction();
        result.setNumerator((frac1.getNumerator()*frac2.getDenominator())+(frac2.getNumerator()*frac1.getDenominator()));
        result.setDenominator(frac1.getDenominator()*frac2.getDenominator());
        return result;
    }
    public static Fraction multiplication(Fraction frac1, Fraction frac2){
        Fraction result = new Fraction();
        result.setNumerator(frac1.getNumerator()*frac2.getNumerator());
        result.setDenominator(frac1.getDenominator()*frac2.getDenominator());
        return result;
    }
    public static Fraction devision(Fraction frac1, Fraction frac2){
        Fraction result = new Fraction();
        result.setNumerator(frac1.getNumerator()*frac2.getDenominator());
        result.setDenominator(frac1.getDenominator()*frac2.getNumerator());
        return result;
    }
}
