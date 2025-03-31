class Employee {
    protected String name;
    protected int empId;
    protected double salary;

    public Employee() {
        this.name = "Unknown";
        this.empId = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int empId, double salary, String department) {
        super(name, empId, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class EmployeeExp5{
    public static void main(String[] args) {
        Employee emp = new Employee("Brishav Debnath", 101, 50000);
        Manager mgr = new Manager("Kamlesh Mondal", 102, 70000, "Sales");
        
        System.out.println(emp.getName() + " earns: $" + emp.getSalary());
        emp.increaseSalary(10);
        System.out.println("After raise, " + emp.getName() + " earns: $" + emp.getSalary());
        
        System.out.println(mgr.getName() + " manages " + mgr.getDepartment() + " department and earns: $" + mgr.getSalary());
        mgr.increaseSalary(15);
        System.out.println("After raise, " + mgr.getName() + " earns: $" + mgr.getSalary());
    }
}

