public class StudentConstructor {
        private String name;
        private int age;
    
        // Default constructor
        public StudentConstructor() {
            this.name = "Brishav";
            this.age = 21;
        }
    
        // Parameterized constructor
        public StudentConstructor(String studentName, int studentAge) {
            this.name = studentName;
            this.age = studentAge;
        }
    
        // Method to display student details
        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    
        public static void main(String[] args) {
            // Creating object using default constructor
            StudentConstructor student1 = new StudentConstructor();
            student1.display();
    
            // Creating object using parameterized constructor
            StudentConstructor student2 = new StudentConstructor("Kamlesh", 21);
            student2.display();
        }
    
    
}
