package Homeworks.ComplexNumber_12;

public class MainComplexNumber {
    public static void main(String[] args) {
        ComplexNumber A = new ComplexNumber(4,5 );
        ComplexNumber B = new ComplexNumber(2,3);

        A.sumComplexNumber(B).printComplexNumber();
        A.subComplexNumber(B).printComplexNumber();
        A.multComplexNumber(B).printComplexNumber();
    }
}
