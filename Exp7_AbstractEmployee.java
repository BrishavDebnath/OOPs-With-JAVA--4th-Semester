// Abstract class representing an Employee
abstract class Employee {
    String name;
    String role;

    // Constructor
    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Abstract methods
    abstract double calculateSalary();
    abstract void displayDetails();
}

// Manager class (fixed monthly salary)
class Manager extends Employee {
    double fixedSalary;

    // Constructor
    Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    // Implement calculateSalary method
    @Override
    double calculateSalary() {
        return fixedSalary;
    }

    // Implement displayDetails method
    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + calculateSalary());
        System.out.println("--------------------");
    }
}

// Developer class (hourly wage calculation)
class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;

    // Constructor
    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement calculateSalary method
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Implement displayDetails method
    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + calculateSalary());
        System.out.println("--------------------");
    }
}

// Main class to test the program
public class Exp7_AbstractEmployee {
    public static void main(String[] args) {
        // Create a Manager object
        Employee manager = new Manager("Brishav Debnath", 5000.0);
        manager.displayDetails();

        // Create a Developer object
        Employee developer = new Developer("Kamlesh Mondal", 50.0, 160);
        developer.displayDetails();
    }
}

