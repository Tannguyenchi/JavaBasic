public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        /*
    - Input: - an int parameter has the name "number"
    - Output: - If the number is negative, the method should return -1 to indicate an invalid value.
              - The method should return the sum of the even digits within the number.
    */

        if (number < 0) {
            return -1; // Invalid value
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // Extract the last digit

            if (digit % 2 == 0) {
                sum += digit; // Add to sum if even
            }

            number /= 10; // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-30));
    }
}
