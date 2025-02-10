public class AdditionalEmployee {
    private double salary;
    public static double totalSalaryExpen=0.0;
    public static int TotalEmployees=0;
    public int EmployeeID;
    public String EmployeeName;
    public String Department;


    public AdditionalEmployee(){
        this.salary=0.0;
        this.EmployeeID=0;
        this.EmployeeName="Unknown.";
        this.Department="Not Assigned";
        TotalEmployees = TotalEmployees+1;
        totalSalaryExpen = totalSalaryExpen+this.salary;
    }

    public AdditionalEmployee(int EmployeeID,String EmployeeName, String Department, int salary){
        this.EmployeeID=EmployeeID;
        this.EmployeeName=EmployeeName;
        this.salary=salary;
        this.Department=Department;
        TotalEmployees = TotalEmployees+1;
        totalSalaryExpen = totalSalaryExpen+salary;

    }

    public double CalculateSalary(){
        return this.salary;
    }

    public void EmployeeDetails(){
        System.out.println("Employee ID:"+this.EmployeeID);
        System.out.println("Employee Name:"+this.EmployeeName);
        System.out.println("Department:"+this.Department);
        System.out.println("Salary:"+this.salary);
    }

    public static void TotalEmployees(){
        System.out.println("The total number of Employees are:"+TotalEmployees);
    }

    public static void main(String []args){
        AdditionalEmployee Emp1= new AdditionalEmployee();
        AdditionalEmployee Emp2= new AdditionalEmployee(123, "Brishav","Science",50000);
        AdditionalEmployee.TotalEmployees();
        System.out.println("The total Salary Expenditure is:"+AdditionalEmployee.totalSalaryExpen);
        System.out.println("The Salary of Employee 1 (default constructor):"+Emp1.CalculateSalary());
        System.out.println("The Salary of Employee 2 (parameterized constructor):"+Emp2.CalculateSalary());
        System.out.println("Employee 1 details:");
        Emp1.EmployeeDetails();
        System.out.println("Employee 2 details:");
        Emp2.EmployeeDetails();
    }

    
}
