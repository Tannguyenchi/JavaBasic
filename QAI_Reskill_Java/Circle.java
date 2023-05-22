/* import package java.util.Scanner để sử dụng lớp Scanner trong Java, 
cho phép chúng ta đọc dữ liệu từ người dùng. */
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        // dùng scanner.nextDouble() để đọc giá trị nhập vào từ người dùng và lưu vào biến radius kiểu double.
        double radius = scanner.nextDouble();
        // Math.PI là hằng số Pi trong Java và Math.pow là phương thức tính lũy thừa.
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}