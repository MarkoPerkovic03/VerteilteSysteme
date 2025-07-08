package common;

import java.util.*;

public class OrderGenerator {
    private static final Random random = new Random();

    public static List<String> productIds = Arrays.asList("P1", "P2", "P3", "P4", "P5");

    public static String randomCustomerId() {
        return "C" + (random.nextInt(9000) + 1000);
    }

    public static String randomOrderId() {
        return UUID.randomUUID().toString();
    }

    public static List<common.OrderItem> randomOrderItems() {
        int count = 1 + random.nextInt(3);
        List<common.OrderItem> items = new ArrayList<>();
        Collections.shuffle(productIds);
        for (int i = 0; i < count; i++) {
            items.add(new common.OrderItem(productIds.get(i), 1 + random.nextInt(2)));
        }
        return items;
    }

    public static common.Order generateOrder() {
        return new common.Order(randomOrderId(), randomCustomerId(), randomOrderItems());
    }
}