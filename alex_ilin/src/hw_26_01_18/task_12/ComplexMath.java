package hw_26_01_18.task_12;

public class ComplexMath {
    private double realNumber;
    private double imagineNumber;

    public ComplexMath() {
    }

    public ComplexMath(double realNumber, double imagineNumber) {
        this.realNumber = realNumber;
        this.imagineNumber = imagineNumber;
    }

    public double getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(double realNumber) {
        this.realNumber = realNumber;
    }

    public double getImagineNumber() {
        return imagineNumber;
    }

    public void setImagineNumber(double imagineNumber) {
        this.imagineNumber = imagineNumber;
    }
}
