public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        /*
    - Input: - an int parameter has the name "number"
    - Output: - If number is < 1, the method should return false.
              - The method must calculate if the number is perfect.
                If the number is perfect, the method should return true; otherwise, it should return false.
    */
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(9));
        System.out.println(isPerfectNumber(6));
    }
}
