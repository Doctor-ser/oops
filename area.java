import java.util.Scanner;

class area {

    double area(double l, double b) {
        return l * b;
    }

    double area(double s) {
        return s * s;
    }

    double area(float r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        area obj = new area();

        System.out.println("Enter length and breadth of rectangle:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.area(l, b));

        System.out.println("Enter side of square:");
        double s = sc.nextDouble();
        System.out.println("Area of Square: " + obj.area(s));

        System.out.println("Enter radius of circle:");
        float r = sc.nextFloat();
        System.out.println("Area of Circle: " + obj.area(r));

        sc.close();
    }
}
