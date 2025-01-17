import java.util.Scanner;

public class NameAndAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Enter your name:");
        String Name = scanner.nextLine();
        System.out.println("Enter your Address:");
        String Address = scanner.nextLine();
        System.out.println("Entered name is:"+ Name);
        System.out.println("Entered Address is:"+ Address);
        System.out.println("---------------------------------");
        scanner.close();
    }
}
