package monitoring;

import common.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderGenerator {
    private static final Random random = new Random();

    public static List<Order> generateOrders(int numberOfOrders) {
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < numberOfOrders; i++) {
            orders.add(generateRandomOrder(i + 1));
        }
        return orders;
    }

    private static Order generateRandomOrder(int orderId) {
        // Generate a random order with dummy data
        Order order = new Order();
        order.setId(orderId);
        order.setItemCount(random.nextInt(5) + 1); // Random item count between 1 and 5
        order.setTotalPrice(random.nextDouble() * 100); // Random total price up to 100
        return order;
    }
}