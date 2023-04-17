public class LeapYear {
//    Leap Year Calculator
    public static boolean isLeapYear(int year) {
        /* isLeapYear: The method should return result true or false
    - Input: - an int parameter has the name "year"
    - Output: - If the year parameter is less than 1 or greater than 9999 return false.
              - Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year,
              otherwise return false. To determine whether a year is a leap year, follow these steps:
                    1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
                    2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
                    3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
                    4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
                    5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
    */
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2001));
    }
}
