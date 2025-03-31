import java.util.Scanner;

// Define the StackInterface
interface StackInterface {
    void push(int element);
    int pop();
    void display();
}

// Implement the StackInterface in StackClass
class StackClass implements StackInterface {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize stack
    public StackClass(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is initially empty
    }

    // Implement push method
    @Override
    public void push(int element) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            stackArray[++top] = element;
            System.out.println(element + " pushed into stack.");
        }
    }

    // Implement pop method
    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            int poppedElement = stackArray[top--];
            System.out.println(poppedElement + " popped from stack.");
            return poppedElement;
        }
    }

    // Implement display method
    @Override
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test stack operations
}

public class Exp7_StackInterface{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();
        StackClass stack = new StackClass(size);

        int choice, value;
        do {
            // Display menu
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

