public class NumberToWords {
    public static void numberToWords(int number) {
        /*
    - Input: - an int parameter has the name "number"
    - Output: - If the number is negative, print "Invalid Value".
              - To print the number as words, follow these steps:
                        1. Extract the last digit of the given number using the remainder operator.
                        2. Convert the value of the digit found in Step 1 into a word.
                         There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
                         Print the corresponding word for each digit, e.g.
                         print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
                        3. Remove the last digit from the number.
                        4. Repeat Steps 2 through 4 until the number is 0.
    */
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);
        int trailingZeroCount = originalDigitCount - reversedDigitCount;

        for (int i = 1; i <= reversedDigitCount; i++) {
            int digit = reversedNumber % 10;
            reversedNumber /= 10;

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }

        for (int i = 1; i <= trailingZeroCount; i++) {
            System.out.println("Zero");
        }}

    public static int reverse(int number) {
         /*
    - Input: - an int parameter has the name "number"
    - Output: - return the reversed number (int)
    */
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        /*
    - Input: - an int parameter has the name "number"
    - Output: - return the count of the digits in that number.
                If the number is negative, return -1 to indicate an invalid value.
    */
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int digitCount = 0;
        while (number > 0) {
            digitCount++;
            number /= 10;
        }

        return digitCount;
    }

    public static void main(String[] args) {
        numberToWords(100);
        numberToWords(200);
    }
}
