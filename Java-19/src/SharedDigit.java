public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
         /*
    - Input: - two int parameter has the name "num1" and "num2"
    - Output: - The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
                otherwise, the method should return false.
              - Each number should be within the range of 10 (inclusive) - 99 (inclusive).
               If one of the numbers is not within the range, the method should return false.
    */
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int num1Digit1 = num1 % 10;
        int num1Digit2 = num1 / 10;

        int num2Digit1 = num2 % 10;
        int num2Digit2 = num2 / 10;

        return (num1Digit1 == num2Digit1 || num1Digit1 == num2Digit2 ||
                num1Digit2 == num2Digit1 || num1Digit2 == num2Digit2);
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,9));
        System.out.println(hasSharedDigit(19,99));
    }
}
