import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exp8FileRead {
    
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
        
        fileScanner.close();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        
        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } finally {
            System.out.println("File operation attempted.");
            scanner.close();
        }
    }
}
