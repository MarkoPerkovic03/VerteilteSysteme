public class InventoryManager {
    private final ProductInventory productInventory;

    public InventoryManager(ProductInventory productInventory) {
        this.productInventory = productInventory;
    }

    public synchronized boolean reserveProduct(Product product, int quantity) {
        if (productInventory.getAvailableQuantity(product) >= quantity) {
            productInventory.decreaseQuantity(product, quantity);
            return true;
        }
        return false;
    }

    public synchronized void restockProduct(Product product, int quantity) {
        productInventory.increaseQuantity(product, quantity);
    }

    public synchronized int checkStock(Product product) {
        return productInventory.getAvailableQuantity(product);
    }
}