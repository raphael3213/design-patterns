package org.example.behavioural.observer;

public class QunatityObserver implements MyObserver{
    @Override
    public void updated(Order observable) {
        int quantity = observable.getQuantity();
        if(quantity <= 5){
            observable.setShippingCharges(20);
        }
        else{
            observable.setShippingCharges(0);
        }

        System.out.printf("Quantity Observer observed an update on state \n");
    }
}
