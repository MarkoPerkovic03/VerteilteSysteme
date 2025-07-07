package seller;

import java.util.concurrent.ConcurrentHashMap;

public class ProductInventory {
    private ConcurrentHashMap<String, Integer> inventory;

    public ProductInventory() {
        this.inventory = new ConcurrentHashMap<>();
    }

    public synchronized void addProduct(String productId, int quantity) {
        inventory.merge(productId, quantity, Integer::sum);
    }

    public synchronized boolean reserveProduct(String productId, int quantity) {
        int currentQuantity = inventory.getOrDefault(productId, 0);
        if (currentQuantity >= quantity) {
            inventory.put(productId, currentQuantity - quantity);
            return true;
        }
        return false;
    }

    public synchronized void releaseProduct(String productId, int quantity) {
        inventory.merge(productId, quantity, Integer::sum);
    }

    public synchronized int getProductQuantity(String productId) {
        return inventory.getOrDefault(productId, 0);
    }
}