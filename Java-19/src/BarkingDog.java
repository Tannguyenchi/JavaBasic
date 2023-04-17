public class BarkingDog {
//    Barking Dog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        /* shouldWakeUp: The method should return result true or false
    - Input: - two parameter: + an boolean parameter has the name "barking"
                              + an int parameter has the name "hourOfDay"
    - Output: - If the hourOfDay parameter is less than 0 or greater than 23 return false.
              - If the dog is barking before 8 or after 22 hours so in that case return true.
    */
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        shouldWakeUp(true,10);
    }
}
