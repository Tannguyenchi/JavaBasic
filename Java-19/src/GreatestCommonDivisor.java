public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
         /*
    - Input: - two int parameter has the name "first" and "second"
    - Output: - If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
              - The method should return the greatest common divisor of the two numbers (int).
                The greatest common divisor is the largest positive integer that can fully divide each of the integers
    */
        if (first < 10 || second < 10) {
            return -1;
        }
        int gcd = 1;
        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(9,9));
        System.out.println(getGreatestCommonDivisor(19,29));
        System.out.println(getGreatestCommonDivisor(1155,1089));
    }
}
