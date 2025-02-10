public class CalculatorAddition {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        CalculatorAddition calculator = new CalculatorAddition();

        // Demonstrating method overloading
        System.out.println("Addition of two integers: " + calculator.add(5, 10));
        System.out.println("Addition of two doubles: " + calculator.add(5.5, 10.5));
        System.out.println("Addition of three integers: " + calculator.add(1, 2, 3));
    }
}
