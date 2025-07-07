package common;

import java.util.List;

public class Order {
    private String orderId;
    private String customerId;
    private List<OrderItem> items;
    private double totalAmount;
    private String status;

    public Order(String orderId, String customerId, List<OrderItem> items, double totalAmount, String status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.items = items;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
        this.totalAmount += item.getPrice();
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
        this.totalAmount -= item.getPrice();
    }
}