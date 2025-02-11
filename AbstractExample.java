abstract class Shape {
    abstract void draw();
}

// Shape s = new Shape(); // ❌ Cannot instantiate abstract class
class Circle extends Shape { // Need subchild class
    void draw() {
        System.out.println("Drawing Circle.");
    }
}
// Shape s = new Circle();

public class AbstractExample {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
