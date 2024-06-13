package org.example.behavioural.observer;

public class PriceObserver implements MyObserver{
    @Override
    public void updated(Order observable) {
        int totalPrice = observable.getTotalPrice();
        if(totalPrice >= 500){
            observable.setDiscount(20);
        }
        else if(totalPrice >= 200){
            observable.setDiscount(10);
        }

        System.out.printf("Price Observer observed an update on state \n");
    }
}
