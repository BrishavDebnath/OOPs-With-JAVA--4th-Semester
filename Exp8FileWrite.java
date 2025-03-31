import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exp8FileWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        
        System.out.print("Enter grade: ");
        String grade = scanner.next();
        
        try (FileWriter writer = new FileWriter("student.txt", true)) { // Append mode
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Student data successfully written to student.txt");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");
        } finally {
            System.out.println("File operation attempted.");
            scanner.close();
        }
    }
}
