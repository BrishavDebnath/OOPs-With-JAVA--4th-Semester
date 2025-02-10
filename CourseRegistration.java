public class CourseRegistration {
    // Attributes for course name and course code
    private String courseName;
    private String courseCode;

    // Constructor using 'this' keyword to differentiate attributes
    public CourseRegistration(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    public static void main(String[] args) {
        // Creating an object of the Course class
        CourseRegistration course = new CourseRegistration("Object-Oriented Programming", "CS101");
        
        // Displaying course details
        course.displayCourseDetails();
    }
}
