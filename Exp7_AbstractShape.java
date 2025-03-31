// Abstract class with an abstract method
abstract class Shape {
    // Abstract method to calculate area (no implementation)
    abstract void calculateArea();
}

// Rectangle class inheriting from Shape
class Rectangle extends Shape {
    double length, width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding calculateArea() method
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Circle class inheriting from Shape
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding calculateArea() method
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class to test the program
public class Exp7_AbstractShape{
    public static void main(String[] args) {
        // Creating a Rectangle object and calculating area
        Shape rectangle = new Rectangle(5.0, 3.0);
        rectangle.calculateArea();

        // Creating a Circle object and calculating area
        Shape circle = new Circle(4.0);
        circle.calculateArea();
    }
}
