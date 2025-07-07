package monitoring;

import java.util.HashMap;
import java.util.Map;

public class MetricsCollector {
    private Map<String, Long> metrics;

    public MetricsCollector() {
        metrics = new HashMap<>();
    }

    public void recordMetric(String metricName, long value) {
        metrics.put(metricName, value);
    }

    public Long getMetric(String metricName) {
        return metrics.get(metricName);
    }

    public Map<String, Long> getAllMetrics() {
        return new HashMap<>(metrics);
    }

    public void clearMetrics() {
        metrics.clear();
    }
}