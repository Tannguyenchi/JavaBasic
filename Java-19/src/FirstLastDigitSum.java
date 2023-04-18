public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        /*
    - Input: - an int parameter has the name "number"
    - Output: - If the number is negative then the method needs to return -1 to indicate an invalid value.
              - The method needs to find the first and the last digit of the parameter number passed to the method,
              using a loop and return the sum of the first and the last digit of that number.
    */
        if (number < 0) {
            return -1; // return -1 for invalid input
        }
        int lastDigit = number % 10; // get the last digit of the number
        int firstDigit = number; // initialize first digit as the number itself
        while (firstDigit >= 10) {
            firstDigit /= 10; // keep dividing by 10 to get the first digit
        }
        return firstDigit + lastDigit; // return the sum of the first and last digit
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(40));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}
