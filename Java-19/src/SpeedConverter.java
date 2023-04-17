public class SpeedConverter {
//    Speed Converter
    public static long toMilesPerHour(double kilometersPerHour) {
        /* Method "toMilesPerHour" : This method needs to return the rounded value of the calculation of type long.
    - Input: - an double parameter has the name "kilometersPerHour"
    - Output: - If the parameter kilometersPerHour is less than 0,
                the method toMilesPerHour needs to return -1 to indicate an invalid value.
              - If it is positive, calculate the value of miles per hour, round it and return it
    */
        if (kilometersPerHour < 0) {
            return -1;
        }
        /*The Math.round() is a built-in math method which returns the closest long to the argument.
        The result is rounded to an integer by adding 1/2, taking the floor of the result after adding 1/2,
        and typecasting the result to type long. The method returns the value of the argument rounded to the nearest int value.*/
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        /* Method "printConversion" :This method should not return anything (void)
                                     and it needs to calculate milesPerHour from the kilometersPerHour parameter.
    - Input: - an double parameter has the name "kilometersPerHour"
    - Output: - If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".
              - Then it needs to print a message in the format "XX km/h = YY mi/h".
                    + XX represents the original value kilometersPerHour.
                    + YY represents the rounded milesPerHour from the kilometersPerHour parameter.
    */
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

    public static void main(String[] args) {
        printConversion(3000);
    }
}

