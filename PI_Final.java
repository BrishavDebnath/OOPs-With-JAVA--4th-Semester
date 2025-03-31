// Base class with a final variable and a final method
class MathConstants {
    // Final variable (constant)
    final double PI = 3.14159;

    // Final method (cannot be overridden)
    final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}

// Derived class attempting to override the final method
class Circle extends MathConstants {
    // Method to calculate area of the circle
    void calculateArea(double radius) {
        double area = PI * radius * radius; // Using final variable PI
        System.out.println("Area of Circle: " + area);
    }

    // Uncommenting the below method will cause a compilation error
    
    /*@Override
    void displayPI() {
        System.out.println("Attempting to override final method.");
    }*/
    
}

public class PI_Final {
    public static void main(String[] args) {
        Circle circle = new Circle();
        
        // Display PI using the final method
        circle.displayPI();

        // Calculate and display the area of a circle
        circle.calculateArea(5.0);

        // Uncommenting the below line will cause a compilation error
        //circle.PI = 3.14; // Cannot modify a final variable
    }
}

