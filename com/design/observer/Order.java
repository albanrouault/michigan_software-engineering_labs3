package design.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<Item> items;
    private List<OrderObserver> observers;
    private int shippingCost;
    private int discount;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.shippingCost = 10;
        this.discount = 0;
    }

    public Order(int orderId, List<Item> items) {
        this.orderId = orderId;
        this.items = items != null ? new ArrayList<>(items) : new ArrayList<>();
        this.observers = new ArrayList<>();
        this.shippingCost = 10;
        this.discount = 0;
    }

    // Observer pattern methods
    public void attach(OrderObserver observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    // Order management methods
    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
            notifyObserver();
        }
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public double getItemsPrice() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public int getCount() {
        return items.size();
    }

    public double getTotalPrice() {
        return getItemsPrice() - this.discount + this.shippingCost;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Details:\n");
        sb.append("Order ID: ").append(orderId).append("\n");
        sb.append("Items count: ").append(getCount()).append("\n");
        sb.append("Items price: $").append(String.format("%.2f", getItemsPrice())).append("\n");
        sb.append("Discount: $").append(discount).append("\n");
        sb.append("Shipping cost: $").append(shippingCost).append("\n");
        sb.append("Total price: $").append(String.format("%.2f", getTotalPrice())).append("\n");
        
        // Decoment if you want to see the items in the order
        
        /*
        if (!items.isEmpty()) {
            sb.append("Items:\n");
            for (Item item : items) {
                sb.append("- ").append(item.toString()).append("\n");
            }
        }
        */
        
        
        return sb.toString();
    }

    public int getOrderId() {
        return orderId;
    }

    // Getters for observers to access order data
    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public int getDiscount() {
        return discount;
    }
}