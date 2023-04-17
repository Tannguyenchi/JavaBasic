public class TeenNumberChecker {
//    Teen Number Checker
    public static boolean hasTeen(int num1, int num2, int num3) {
        /* hasTeen: The method should return result true or false
    - Input: - three int parameter has the name "num1" and "num2" and "num3"
    - Output: - The method should return boolean and it needs to return true
    if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
    */
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num) {
        /* isTeen: The method should return result true or false
    - Input: - An int parameter has the name "num"
    - Output: -The method should return boolean and
    it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
    */
        return num >= 13 && num <= 19;
    }

    public static void main(String[] args) {
        hasTeen(3,15,20);
    }
}
