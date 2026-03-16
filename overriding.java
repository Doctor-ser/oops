class Shape {
    void calculateArea() {
        System.out.println("Calculating area...");
    }
}

class Rectangle extends Shape {
    void calculateArea() {
        System.out.println("Area of Rectangle = " + (10 * 5));
    }
}

class Circle extends Shape {
    void calculateArea() {
        System.out.println("Area of Circle = " + (3.14 * 7 * 7));
    }
}

class Square extends Shape {
    void calculateArea() {
        System.out.println("Area of Square = " + (4 * 4));
    }
}

public class overriding {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        Shape c = new Circle();
        Shape s = new Square();

        r.calculateArea();
        c.calculateArea();
        s.calculateArea();
    }
}
