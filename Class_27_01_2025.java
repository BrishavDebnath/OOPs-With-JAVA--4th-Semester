public class Class_27_01_2025 {
    int value;
void setValue(int value) {
this.value = value; // no effect on instance variable)
}
void display() {
System.out.println("Value: " + value);} // Prints default value: 0 }
public static void main(String[] args) {
Class_27_01_2025 obj = new Class_27_01_2025();
obj.setValue(50);
obj.display(); }
    
}
