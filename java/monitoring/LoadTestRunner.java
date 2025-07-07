import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LoadTestRunner {

    private final int numberOfThreads;
    private final int numberOfRequests;

    public LoadTestRunner(int numberOfThreads, int numberOfRequests) {
        this.numberOfThreads = numberOfThreads;
        this.numberOfRequests = numberOfRequests;
    }

    public void runLoadTest() {
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        for (int i = 0; i < numberOfRequests; i++) {
            executor.submit(this::simulateRequest);
        }

        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }

    private void simulateRequest() {
        // Simulate a request to the system
        // This could involve calling an API endpoint or processing an order
        System.out.println("Simulating request from thread: " + Thread.currentThread().getName());
        // Add logic to measure response time and success/failure of the request
    }

    public static void main(String[] args) {
        LoadTestRunner loadTestRunner = new LoadTestRunner(10, 100);
        loadTestRunner.runLoadTest();
    }
}