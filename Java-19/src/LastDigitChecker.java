public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        /*
    - Input: - three int parameter has the name "a" and "b" and "c"
    - Output: - Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
                If one of the numbers is not within the range, the method should return false.
              - The method should return true if at least two of the numbers share the same rightmost digit;
                otherwise, it should return false.
    */
        if(!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        return (lastDigitA == lastDigitB) || (lastDigitA == lastDigitC) || (lastDigitB == lastDigitC);
    }

    public static boolean isValid(int number) {
        /*
    - Input: - an int parameter has the name "number"
    - Output: - The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive),
                otherwise return false.
    */
        return (number >= 10 && number <= 1000);
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(10,10,10));
        System.out.println(hasSameLastDigit(15,10,9));
        System.out.println(hasSameLastDigit(15,10011,9));
    }
}
