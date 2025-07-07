import java.util.Random;

public class FailureSimulator {
    private Random random;
    private double failureRate;

    public FailureSimulator(double failureRate) {
        this.random = new Random();
        this.failureRate = failureRate;
    }

    public boolean simulateFailure() {
        return random.nextDouble() < failureRate;
    }

    public void setFailureRate(double failureRate) {
        this.failureRate = failureRate;
    }

    public double getFailureRate() {
        return failureRate;
    }
}