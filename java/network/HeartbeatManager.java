package network;

public class HeartbeatManager {
    private final long heartbeatInterval;
    private boolean running;

    public HeartbeatManager(long heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
        this.running = false;
    }

    public void start() {
        running = true;
        new Thread(() -> {
            while (running) {
                sendHeartbeat();
                try {
                    Thread.sleep(heartbeatInterval);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }

    public void stop() {
        running = false;
    }

    private void sendHeartbeat() {
        // Logic to send a heartbeat signal to check service availability
        System.out.println("Heartbeat sent at " + System.currentTimeMillis());
    }
}