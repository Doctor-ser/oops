import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }

    public double perimeter() {
        return 2 * 3.14 * r;
    }
}

class Rectangle implements Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return l * b;
    }

    public double perimeter() {
        return 2 * (l + b);
    }
}


public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    System.out.println("Area = " + c.area());
                    System.out.println("Perimeter = " + c.perimeter());
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();
                    Rectangle rec = new Rectangle(l, b);
                    System.out.println("Area = " + rec.area());
                    System.out.println("Perimeter = " + rec.perimeter());
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (ch != 3);

        sc.close();
    }
}
