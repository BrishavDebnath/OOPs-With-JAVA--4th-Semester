public class MethodChainingExample {
    int value;
MethodChainingExample setValue(int value) {
this.value = value;
return this; // Returns the current object
}
MethodChainingExample increment() {
this.value += 10;
return this;
}
void display() {
System.out.println("Value: " + this.value);
}
public static void main(String[] args) {
MethodChainingExample obj = new MethodChainingExample();
obj.setValue(50).increment().display();
}
}
