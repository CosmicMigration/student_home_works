package hw_26_01_18.task_13;

public class FractionStart {
    public static void main(String[] args) {
        program();

    }
    public static void program(){
        Fraction fraction = new Fraction();
        Fraction fraction2 = new Fraction();
        addition(fraction, fraction2);

    }
    public static Fraction addition(Fraction frac1, Fraction frac2){
        Fraction result = new Fraction();
        result.setNumerator(frac1.getNumerator()+frac2.getNumerator());
        return result;
    }
}
