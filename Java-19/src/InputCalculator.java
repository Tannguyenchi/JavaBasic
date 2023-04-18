import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        /*
    - Input: - does not have any parameters
    - Output: - The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
                When the user enters something that is not an int then
                it needs to print a message in the format "SUM = XX AVG = YY".
                XX represents the sum of all entered numbers of type int.
                YY represents the calculated average of all numbers of type long.
    */
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
        }

        scanner.close();
        long average = 0;
        if (count > 0) {
            average = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
