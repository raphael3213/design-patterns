package org.example.behavioural.observer;

import java.util.LinkedList;
import java.util.List;

public class Order  {



    private int id;

    private int totalPrice;
    private int quantity;
    private int discount;
    private int shippingCharges;

    public Order(int id) {
        this.id = id;
    }
    // Observable Methods to manage and notify observers
    private final List<MyObserver> observerList = new LinkedList<>();

    public void attach (MyObserver observer) {
        observerList.add(observer);
    }

    public void detach (MyObserver observer){
        observerList.remove(observer);
    }

    protected void publish() {
        observerList.forEach((observer) -> observer.updated(this));
    }


    public int getTotalPrice() {
        return totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getShippingCharges() {
        return this.shippingCharges;
    }

    public void setShippingCharges(int charge) {
        this.shippingCharges = charge;
    }

    public int getBill(){
        return (totalPrice * (100 - discount)/100) + shippingCharges;
    }

    public void addItem(int price){
        quantity++;
        totalPrice+=price;
        publish();
        // This notifies all observers that the state has changed,
        // it is now up to them to query the subject/observable to figure out what has changed.
    }


}
