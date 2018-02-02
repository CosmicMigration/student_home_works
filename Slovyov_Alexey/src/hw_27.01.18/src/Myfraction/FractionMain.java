package Myfraction;

public class FractionMain {

    public static void main(String[] args) {

        Fraction fract=new Fraction(10,2);
        System.out.println( "Выводим в виде дроби:"+fract.toString());
        System.out.println("--------------------------------");
        System.out.println(fract.multiplication(3));
        System.out.println("---------------------------------");
        System.out.println(fract.division(4));
        System.out.println("---------------------------------");

    }
}
