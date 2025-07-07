package monitoring;

public class SystemMonitor {
    
    private boolean systemHealthy;

    public SystemMonitor() {
        this.systemHealthy = true; // Assume system is healthy at start
    }

    public void checkSystemHealth() {
        // Logic to check the health of various system components
        // Update systemHealthy based on health checks
    }

    public boolean isSystemHealthy() {
        return systemHealthy;
    }

    public void reportStatus() {
        if (systemHealthy) {
            System.out.println("System is healthy.");
        } else {
            System.out.println("System is experiencing issues.");
        }
    }
}