// Final class (cannot be inherited)
final class Logger {
    // Method to log a message
    void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

// Uncommenting the below class will cause a compilation error
/*
class ExtendedLogger extends Logger { // Compilation error: Cannot inherit from final class
    void logMessage(String message) {
        System.out.println("Extended Log: " + message);
    }
}
*/

public class Final_Logger {
    public static void main(String[] args) {
        // Creating an object of the final class
        Logger logger = new Logger();
        
        // Calling the logMessage method
        logger.logMessage("This is a log message.");
    }
}
