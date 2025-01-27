public class Example1 {
    Example1() {
        this(10); // Calls parameterized constructor
        System.out.println("Default constructor");
        }
        Example1(int x) {
        System.out.println("Parameterized constructor with value: " + x);
        }
        public static void main(String[] args) {
        Example1 obj = new Example1(); // Calls the default constructor
        }
}
