public class AreaCalculator {
//    Area Calculator
    public static double area(double radius) {
        /*
        - Input: - an double parameter has the name "radius"
        - Output: - If the radius is less than 0 return -1.0. Otherwise, return Math.PI * radius * radius.
        */
        if (radius < 0) {
            return -1.0;
        }
//        The formula for calculating a circle area is radius * radius * PI.
//        For PI use a constant from Math class e.g. Math.PI
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        /*
        - Input: - two double parameter has the name "x" and "y"
        - Output: - If the x is less than 0 or y is less than 0 then return -1.0. Otherwise, return x*y.
        */
        if (x < 0 || y < 0) {
            return -1.0;
        }
//        The formula for calculating the area of a rectangle is x * y.
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(area(2));
        System.out.println(area(3,4));
    }
}
