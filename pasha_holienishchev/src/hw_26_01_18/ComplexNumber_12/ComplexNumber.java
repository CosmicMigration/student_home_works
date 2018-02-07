package Homeworks.ComplexNumber_12;

public class ComplexNumber {
    //z= a +i*b
    private double a;
    private double b;

    public ComplexNumber sumComplexNumber(ComplexNumber C) {
        ComplexNumber D = new ComplexNumber(this.a + C.getA(), this.b + C.getB());
        return D;
    }

    public ComplexNumber subComplexNumber(ComplexNumber C) {
        ComplexNumber D = new ComplexNumber(this.a - C.getA(), this.b - C.getB());
        return D;
    }

    public ComplexNumber multComplexNumber(ComplexNumber C) {
        ComplexNumber D = new ComplexNumber(this.a * C.getA() - this.b * C.getB(), this.a * C.getB() + this.b * C.getA());
        return D;
    }

    public void printComplexNumber() {
        System.out.println("z = " + this.a + " + " + b + "i");
    }

    public ComplexNumber() {
    }

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
