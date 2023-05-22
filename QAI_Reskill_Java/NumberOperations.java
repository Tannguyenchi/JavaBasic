import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Tìm giá trị lớn nhất và nhỏ nhất của hai số
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // In số lớn nhất và nhỏ nhất
        System.out.println("max = " + max + ", min = " + min);

        // Hoán đổi giá trị của a và b bằng biến tạm thời
        int temp = a;
        a = b;
        b = temp;

        // In giá trị đã hoán đổi
        System.out.println("a = " + a + ", b = " + b);
    }
}
