package design.observer;

public class Client {
    public static void main(String[] args) {
        Order order = new Order(1);
        order.addItem(Item.getRandomItem());
        order.addItem(Item.getRandomItem());

        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        System.out.println("Order: " + order);

        order.addItem(Item.getRandomItem());
        order.addItem(Item.getRandomItem());
        order.addItem(Item.getRandomItem());

        System.out.println("Order: " + order);
        
        order.addItem(Item.getRandomItem());

        System.out.println("Order: " + order);
    }
}
