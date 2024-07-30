public class Logger {
    // Private static instance of the Logger class
    private static Logger instance;
    
    // Private constructor to prevent instantiation
    private Logger() {
        // Initialize the logger if needed
    }
    
    // Public static method to return the instance of the Logger class
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    // Method to log messages
    public void log(String message) {
        System.out.println(message);
    }
}
