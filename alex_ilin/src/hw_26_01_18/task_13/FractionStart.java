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

        System.out.println(addition(fraction, fraction2).toString());
        System.out.println(multiplication(fraction).toString());
        System.out.println(devision(fraction).toString());

    }
    public static Fraction addition(Fraction frac1, Fraction frac2){
        Fraction result = new Fraction();
        result.setNumerator((frac1.getNumerator()*frac2.getDenominator())+(frac2.getNumerator()*frac1.getDenominator()));
        result.setDenominator(frac1.getDenominator()*frac2.getDenominator());
        return result;
    }
    public static Fraction multiplication(Fraction frac1){

        double resulter = frac1.getNumerator()/frac1.getDenominator();
        double multiplicator = 5.5;
        double newResult = resulter*multiplicator;
        Fraction result = new Fraction();
        return result;
    }
    public static Fraction devision(Fraction frac1){
        Fraction result = new Fraction();
        double resulter = frac1.getNumerator()/frac1.getDenominator();
        double devisier = 5.5;
        double newResult = resulter/devisier;
        return result;
    }
}
