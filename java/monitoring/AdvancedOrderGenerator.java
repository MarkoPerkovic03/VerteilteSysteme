package monitoring;

import common.Order; // <-- Importiere die zentrale Order-Klasse

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdvancedOrderGenerator {

    private static final String[] PRODUCT_IDS = {"P001", "P002", "P003", "P004", "P005"};
    private static final int MAX_QUANTITY = 10;
    private static final Random RANDOM = new Random();

    public List<Order> generateAdvancedOrders(int numberOfOrders) {
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < numberOfOrders; i++) {
            orders.add(generateOrder(i + 1));
        }
        return orders;
    }

    private Order generateOrder(int orderId) {
        String productId = PRODUCT_IDS[RANDOM.nextInt(PRODUCT_IDS.length)];
        int quantity = RANDOM.nextInt(MAX_QUANTITY) + 1;
        return new Order(orderId, productId, quantity);
    }
}

// Entferne die lokale Order-Klasse!