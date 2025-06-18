package design.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<Item> items;
    private List<OrderObserver> observers;
    private int shippingCost;
    private int discount;

    public Order() {
        // Not yet implemented
    }

    public Order(List<Item> items) {
        // Not yet implemented
    }

    // Observer pattern methods
    public void attach(OrderObserver observer) {
        // Not yet implemented
    }

    public void detach(OrderObserver observer) {
        // Not yet implemented
    }

    public void notifyObserver() {
        // Not yet implemented
    }

    // Order management methods
    public void addItem(Item item) {
        // Not yet implemented
    }

    public void setDiscount(int discount) {
        // Not yet implemented
    }

    public void setShippingCost(int shippingCost) {
        // Not yet implemented
    }

    public double getItemsPrice() {
        // Not yet implemented
        return 0.0;
    }

    public int getCount() {
        // Not yet implemented
        return 0;
    }

    public int getOrderId() {
        // Not yet implemented
        return -1;
    }

    public double getTotalPrice() {
        // Not yet implemented
        return 0.0;
    }

    public String toString() {
        // Not yet implemented
        return "";
    }

    // Getters for observers to access order data
    public List<Item> getItems() {
        // Not yet implemented
        return null;
    }

    public int getShippingCost() {
        // Not yet implemented
        return 0;
    }

    public int getDiscount() {
        // Not yet implemented
        return 0;
    }
}