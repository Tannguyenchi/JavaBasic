public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        /*
        - Input: an long parameter has the name "minutes"
        - Output: - If the minutes parameter is less than 0 print "Invalid Value".
                  - Otherwise, if the parameter is valid
                  then it needs to print a message in the format "XX min = YY y and ZZ d".
                    + XX represents the original value minutes.
                    + YY represents the calculated years.
                    + ZZ represents the calculated days.
         */
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(1000444444);
    }
}
