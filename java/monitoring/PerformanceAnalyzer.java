package monitoring;

import java.util.ArrayList;
import java.util.List;

public class PerformanceAnalyzer {
    private List<Long> responseTimes;
    private long totalResponseTime;
    private int requestCount;

    public PerformanceAnalyzer() {
        responseTimes = new ArrayList<>();
        totalResponseTime = 0;
        requestCount = 0;
    }

    public void recordResponseTime(long responseTime) {
        responseTimes.add(responseTime);
        totalResponseTime += responseTime;
        requestCount++;
    }

    public double calculateAverageResponseTime() {
        if (requestCount == 0) {
            return 0;
        }
        return (double) totalResponseTime / requestCount;
    }

    public long getMaxResponseTime() {
        return responseTimes.stream().max(Long::compare).orElse(0L);
    }

    public long getMinResponseTime() {
        return responseTimes.stream().min(Long::compare).orElse(0L);
    }

    public int getRequestCount() {
        return requestCount;
    }

    public void reset() {
        responseTimes.clear();
        totalResponseTime = 0;
        requestCount = 0;
    }
}