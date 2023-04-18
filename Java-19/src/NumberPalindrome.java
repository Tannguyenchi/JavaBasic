public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        /*
    - Input: - an int parameter has the name "number"
    - Output: - It should return true if the number is a palindrome number otherwise it should return false.
    */
        if (number < 0) {
            number = Math.abs(number); // convert negative number to positive
        }

        int reverse = 0;
        int original = number;

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));//result: True
        System.out.println(isPalindrome(102));//result: False
        System.out.println(isPalindrome(-101));//result: True
        System.out.println(isPalindrome(-102));//result: False
    }
}
