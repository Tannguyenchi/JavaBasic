public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        /*
        - Input: - without any parameters
        - Output: - return the value of firstNumber field
        */
        return firstNumber;
    }

    public double getSecondNumber() {
        /*
        - Input: - without any parameters
        - Output: - return the value of secondNumber field
        */
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        /*
        - Input: - one parameter of type double
        - Output: - set the value of the firstNumber field
        */
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        /*
        - Input: - one parameter of type double
        - Output: - set the value of the secondNumber field
        */
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        /*
        - Input: - without any parameters
        - Output: - return the result of adding the field values of firstNumber and secondNumber
        */
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        /*
        - Input: - without any parameters
        - Output: - return the result of subtracting the field values of secondNumber from the firstNumber
        */
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        /*
        - Input: - without any parameters
        - Output: - return the result of multiplying the field values of firstNumber and secondNumber
        */
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        /*
        - Input: - without any parameters
        - Output: - return the result of dividing the field values of firstNumber by the secondNumber.
                    In case the value of secondNumber is 0 then return 0.
        */
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(5);

        System.out.println("First number: " + calculator.getFirstNumber());
        System.out.println("Second number: " + calculator.getSecondNumber());
        System.out.println("Addition result: " + calculator.getAdditionResult());
        System.out.println("Subtraction result: " + calculator.getSubtractionResult());
        System.out.println("Multiplication result: " + calculator.getMultiplicationResult());
        System.out.println("Division result: " + calculator.getDivisionResult());
    }
}
