package design.observer;

public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        // If the cost of the order is more than $200, provide a $20 discount
        if (order.getItemsPrice() > 200) {
            order.setDiscount(20);
        } else {
            order.setDiscount(0);
        }
    }
}
