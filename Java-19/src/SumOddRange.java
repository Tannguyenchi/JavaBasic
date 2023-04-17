public class SumOddRange {
    public static boolean isOdd(int number) {
        /*
    - Input: - an int parameter has the name "number"
    - Output: - Check that number is > 0, if it is not return false.
              - If number is odd return true, otherwise return false.
    */
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        /*
    - Input: - two int parameter has the name "start" and "end"
    - Output: - The parameter end needs to be greater than or equal to start and
     both start and end parameters have to be greater than 0.
              - If those conditions are not satisfied return -1 from the method to indicate invalid input.
    */
        if (start <= 0 || end <= 0 || end < start) {
            return -1;
        }

        int sum = 0;
//        The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(30, 50));
    }
}
