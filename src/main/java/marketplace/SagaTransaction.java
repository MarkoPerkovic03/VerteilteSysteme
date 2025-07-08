package marketplace;

import java.util.*;

public class SagaTransaction {
    private String orderId;
    private Map<String, Boolean> productStatus = new HashMap<>();
    private boolean completed = false;

    public SagaTransaction(String orderId, List<String> productIds) {
        this.orderId = orderId;
        for (String pid : productIds) {
            productStatus.put(pid, false);
        }
    }

    public void confirmProduct(String productId) {
        productStatus.put(productId, true);
    }

    public void rejectProduct(String productId) {
        productStatus.put(productId, false);
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean allConfirmed() {
        return productStatus.values().stream().allMatch(v -> v);
    }

    public boolean anyRejected() {
        return productStatus.values().stream().anyMatch(v -> !v);
    }
}