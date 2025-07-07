public class Constants {
    public static final String APPLICATION_NAME = "Marketplace System";
    public static final String VERSION = "1.0.0";
    public static final int MAX_RETRIES = 3;
    public static final long TIMEOUT = 5000; // in milliseconds
    public static final String DEFAULT_CURRENCY = "USD";
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    
    // Private constructor to prevent instantiation
    private Constants() {
        throw new UnsupportedOperationException("This is a constants class and cannot be instantiated");
    }
}