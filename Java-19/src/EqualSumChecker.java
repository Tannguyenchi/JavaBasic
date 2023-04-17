public class EqualSumChecker {
//    Equal Sum Checker
    public static boolean hasEqualSum(int num1, int num2, int sum) {
        /* hasEqualSum: The method should return result true or false
    - Input: - three int parameter has the name "num1" and "num2" and "sum"
    - Output: - it needs to return true if the sum of the first and second parameter is equal to the third parameter.
                Otherwise, return false.
    */
        return num1 + num2 == sum;
    }

    public static void main(String[] args) {
        hasEqualSum(3,5,8);
    }

}
