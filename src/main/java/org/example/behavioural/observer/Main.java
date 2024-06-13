package org.example.behavioural.observer;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(1);
        order.attach(new PriceObserver());
        order.attach(new QunatityObserver());


        order.addItem(400);
        order.addItem(400);
        order.addItem(400);



        System.out.println("The bill for the order is : " + order.getBill() +
                " with a discount of : " + order.getDiscount() +
                " with shipping charges of : " + order.getShippingCharges());

        order.addItem(400);
        order.addItem(400);
        order.addItem(400);

        System.out.println("The bill for the order is : " + order.getBill() +
                " with a discount of : " + order.getDiscount() +
                " with shipping charges of : " + order.getShippingCharges());
        order.getBill();
    }
}
