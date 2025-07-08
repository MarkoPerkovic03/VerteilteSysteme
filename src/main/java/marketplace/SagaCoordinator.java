package marketplace;

import java.util.*;

public class SagaCoordinator {
    private Map<String, SagaTransaction> transactions = new HashMap<>();

    public void startTransaction(String orderId, SagaTransaction transaction) {
        transactions.put(orderId, transaction);
    }

    public SagaTransaction getTransaction(String orderId) {
        return transactions.get(orderId);
    }

    public void completeTransaction(String orderId) {
        transactions.remove(orderId);
    }
}