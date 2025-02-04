public class OverloadExample3 {
        // Overloaded method with different number of parameters
        void display(int a) {
            System.out.println("Integer: " + a);
        }
    
        void display(int a, double b) {
            System.out.println("Integer: " + a + ", Double: " + b);
        }
    
        // Overloaded method with different types of parameters
        void display(double a) {
            System.out.println("Double: " + a);
        }
    
        // Overloaded method with different order of parameters
        void display(double a, int b) {
            System.out.println("Double: " + a + ", Integer: " + b);
        }
    
        public static void main(String[] args) {
            OverloadExample3 obj = new OverloadExample3();
            obj.display(5);         // Calls display(int)
            obj.display(5, 3.14);   // Calls display(int, double)
            obj.display(3.14);      // Calls display(double)
            obj.display(3.14, 5);   // Calls display(double, int)
        }
    
}
