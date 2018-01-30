package hw_26_01_18.task_13;

import java.util.concurrent.ThreadLocalRandom;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        for(;;) {
            int setNumenator = ThreadLocalRandom.current().nextInt(1, 50 + 1);
            int setDenominator = ThreadLocalRandom.current().nextInt(1, 50 + 1);
            if (setNumenator < setDenominator) {
                this.numerator = setNumenator;
                this.denominator = setDenominator;
                break;
            }
        }
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

    @Override
    public String toString() {
        return "Common fraction: " + numerator + "/" +
                denominator;
    }
}
