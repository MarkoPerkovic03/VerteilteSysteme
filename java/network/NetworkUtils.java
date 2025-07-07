package network;

public class NetworkUtils {
    
    public static String getHostAddress() {
        // Implement logic to retrieve the host address
        return "localhost"; // Placeholder
    }

    public static int getPort() {
        // Implement logic to retrieve the port number
        return 8080; // Placeholder
    }

    public static void validateNetworkConfiguration(String host, int port) throws IllegalArgumentException {
        if (host == null || host.isEmpty()) {
            throw new IllegalArgumentException("Host cannot be null or empty");
        }
        if (port <= 0 || port > 65535) {
            throw new IllegalArgumentException("Port must be between 1 and 65535");
        }
    }

    public static void logNetworkActivity(String message) {
        // Implement logic to log network activity
        System.out.println("Network Activity: " + message);
    }
}