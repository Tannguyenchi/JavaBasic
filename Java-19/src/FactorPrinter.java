public class FactorPrinter {
    public static void printFactors(int number) {
        /*
    - Input: - an int parameter has the name "number"
    - Output: - If number is < 1, the method should print "Invalid Value".
              - The method should print all factors of the number.
                A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
    */
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        printFactors(50);
    }
}
