package network;

import java.util.Random;

public class FailureSimulator {
    private final Random random = new Random();
    private double crashProbability;
    private double dropProbability;
    private double timeoutProbability;
    private int minDelayMs;
    private int maxDelayMs;

    public FailureSimulator(double crashProbability, double dropProbability, double timeoutProbability, int minDelayMs, int maxDelayMs) {
        this.crashProbability = crashProbability;
        this.dropProbability = dropProbability;
        this.timeoutProbability = timeoutProbability;
        this.minDelayMs = minDelayMs;
        this.maxDelayMs = maxDelayMs;
    }

    public boolean shouldCrash() {
        return random.nextDouble() < crashProbability;
    }

    public boolean shouldDrop() {
        return random.nextDouble() < dropProbability;
    }

    public boolean shouldTimeout() {
        return random.nextDouble() < timeoutProbability;
    }

    public int simulateDelay() {
        return minDelayMs + random.nextInt(maxDelayMs - minDelayMs + 1);
    }
}