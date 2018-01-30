package hw_26_01_18.task_12;

public class ComplexMain {

    public static void main(String[] args) {
        ComplexMath complexMath1 = new ComplexMath(3.5,4.3);
        ComplexMath complexMath2 = new ComplexMath(2,5);

        mathPart('/', complexMath1, complexMath2);

    }
    public static void mathPart(char operation, ComplexMath complexNumbers1, ComplexMath complexNumbers2) {
        ComplexMath result = new ComplexMath();

        switch (operation) {
            case '+':
                result.setRealNumber(complexNumbers1.getRealNumber() + complexNumbers2.getRealNumber());
                result.setImagineNumber(complexNumbers1.getImagineNumber() + complexNumbers2.getImagineNumber());
                break;
            case '-':
                result.setRealNumber(complexNumbers1.getRealNumber() - complexNumbers2.getRealNumber());
                result.setImagineNumber(complexNumbers1.getImagineNumber() - complexNumbers2.getImagineNumber());
                break;
            case '*':
                result.setRealNumber(complexNumbers1.getRealNumber() * complexNumbers2.getRealNumber() -
                        complexNumbers1.getImagineNumber() * complexNumbers2.getImagineNumber());

                result.setImagineNumber(complexNumbers1.getRealNumber() * complexNumbers2.getImagineNumber() +
                        complexNumbers1.getImagineNumber() * complexNumbers2.getRealNumber());
                break;
            case '/':
                result.setRealNumber((complexNumbers1.getRealNumber() * complexNumbers2.getRealNumber() +
                        complexNumbers1.getImagineNumber() * complexNumbers2.getImagineNumber()) /
                        (complexNumbers2.getRealNumber() * complexNumbers2.getRealNumber()) +
                        (complexNumbers2.getImagineNumber() * complexNumbers2.getImagineNumber()));

                result.setImagineNumber((complexNumbers2.getRealNumber() * complexNumbers1.getImagineNumber() -
                        complexNumbers2.getImagineNumber() * complexNumbers1.getRealNumber()) /
                        (complexNumbers2.getRealNumber() * complexNumbers2.getRealNumber()) +
                        (complexNumbers2.getImagineNumber() * complexNumbers2.getImagineNumber()));
                break;
        }
        System.out.println(result.getRealNumber() + " + i" + result.getImagineNumber());
    }
}
