public class IntEqualityPrinter {
    public static void printEqual(int num1, int num2, int num3) {
        /*
    - Input: - three int parameter has the name "num1" and "num2" and "num3"
    - Output: - If one of the parameters is less than 0, print text "Invalid Value".
              - If all numbers are equal print text "All numbers are equal"
              - If all numbers are different print text "All numbers are different".
              - Otherwise, print "Neither all are equal or different".
    */
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void main(String[] args) {
        printEqual(3,3,6);
    }
}
