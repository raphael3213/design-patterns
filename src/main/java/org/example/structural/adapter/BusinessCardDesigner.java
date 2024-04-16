package org.example.structural.adapter;

public class BusinessCardDesigner {
    private final Customer customer;
    public BusinessCardDesigner(Customer customer) {
        this.customer = customer;
    }

    public String designCard(){
        return String.format("%s - %s - %s" , customer.getName(), customer.getDesignation() , customer.getAddress());
    }
}
