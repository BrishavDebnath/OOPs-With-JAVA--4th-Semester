public class University {
    // Static variable for university name
    static String universityName = "UPES";
    
    // Non-static variable for student name
    String studentName;
    
    // Constructor to initialize student name
    public University(String studentName) {
        this.studentName = studentName;
    }
    
    // Static method to display university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }
    
    // Method to display student details
    public void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }
    
    public static void main(String[] args) {
        // Display university name using static method
        University.displayUniversityName();
        
        // Creating multiple student objects
        University student1 = new University("Brishav");
        University student2 = new University("Kamlesh");
        
        // Displaying student details
        student1.displayStudent();
        student2.displayStudent();
        
        // Demonstrating that universityName is shared among all instances
        System.out.println("Shared University Name: " + University.universityName);
    }
}

