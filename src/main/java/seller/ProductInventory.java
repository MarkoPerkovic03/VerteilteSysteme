package seller;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ProductInventory {
    private final Map<String, Integer> inventory = new ConcurrentHashMap<>();

    public void addProduct(String productId, int quantity) {
        inventory.put(productId, quantity);
    }

    public boolean reserveProduct(String productId, int quantity) {
        return inventory.computeIfPresent(productId, (k, v) -> {
            if (v >= quantity) {
                return v - quantity;
            } else {
                return v;
            }
        }) != null && inventory.get(productId) >= 0;
    }

    public void releaseProduct(String productId, int quantity) {
        inventory.computeIfPresent(productId, (k, v) -> v + quantity);
    }

    public int getStock(String productId) {
        return inventory.getOrDefault(productId, 0);
    }
}