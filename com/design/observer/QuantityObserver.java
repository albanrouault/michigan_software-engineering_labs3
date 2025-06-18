package design.observer;

public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        // If the quantity of items is more than 5, set shipping cost to zero
        // Otherwise, the default shipping cost is $10
        if (order.getCount() > 5) {
            order.setShippingCost(0);
        } else {
            order.setShippingCost(10);
        }
    }
}
