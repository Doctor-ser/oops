// Abstract class
abstract class Shape {
    // Abstract method
    abstract double findArea();
}

// Rectangle subclass
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double findArea() {
        return length * width;
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double findArea() {
        return Math.PI * radius * radius;
    }
}

// Square subclass
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double findArea() {
        return side * side;
    }
}

// Main class
public class abs {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);
        Circle circle = new Circle(7);
        Square square = new Square(4);

        System.out.println("Area of Rectangle: " + rectangle.findArea());
        System.out.println("Area of Circle: " + circle.findArea());
        System.out.println("Area of Square: " + square.findArea());
    }
}
