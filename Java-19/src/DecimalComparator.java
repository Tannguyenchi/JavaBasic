public class DecimalComparator {
//    DecimalComparator
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        /* areEqualByThreeDecimalPlaces: The method should return result true or false
    - Input: - two double parameter has the name "num1" and "num2"
    - Output: - it needs to return true if two double numbers are the same up to three decimal places.
                Otherwise, return false.
    */
        /*In Java, casting is the process of converting a value of one data type to another.
          There are two types of casting: widening (implicit) casting and narrowing (explicit) casting.*/
        /* In the example above, the two parameter num1 and num2 is explicitly cast to an int,
         causing the decimal portion of the value to be truncated and lost.*/
        int scaled1 = (int) (num1 * 1000);
        int scaled2 = (int) (num2 * 1000);
        return scaled1 == scaled2;
    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(1.0,3.0);
    }
}
