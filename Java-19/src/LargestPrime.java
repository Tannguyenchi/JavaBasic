public class LargestPrime {
    public static int getLargestPrime(int number) {
        /*
    - Input: - an int parameter has the name "number"
    - Output: - If the number is negative or does not have any prime numbers,
                the method should return -1 to indicate an invalid value.
              - The method should calculate the largest prime factor of a given number and return it.
    */
        if (number <= 1) {
            return -1;
        }

        int largestPrime = -1;
        int divisor = 2;

        while (number > 1) {
            if (number % divisor == 0) {
                largestPrime = divisor;
                number /= divisor;
                while (number % divisor == 0) {
                    number /= divisor;
                }
            }
            divisor++;
        }

        return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(199));
    }
}
