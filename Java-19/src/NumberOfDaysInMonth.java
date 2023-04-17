public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        /*
    - Input: - an int parameter has the name "year"
    - Output: - If the parameter is not in that range (year < 1 || year > 9999) return false.
              - Otherwise, if it is in the valid range,
              calculate if the year is a leap year and return true if it is, otherwise return false.
    */
        if (year < 1 || year > 9999) {
            return false;
        } else {
            // A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

    public static int getDaysInMonth(int month, int year) {
        /*
    - Input: - two int parameter has the name "month" and "year"
    - Output: - If parameter month is < 1 or > 12 return -1.
              - If parameter year is < 1 or > 9999 then return -1.
              - This method needs to return the number of days in the month.
              Be careful about leap years they have 29 days in month 2 (February).
              - You should check if the year is a leap year using the method isLeapYear described above.
    */
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 2:
                    return isLeapYear(year) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(3,1999));
    }
}
